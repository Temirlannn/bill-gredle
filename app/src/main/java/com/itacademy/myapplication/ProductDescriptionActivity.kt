package com.itacademy.myapplication

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

import android.widget.TextView
import com.bumptech.glide.Glide
import com.itacademy.myapplication.adapters.Cart
import com.itacademy.myapplication.model.Product

class ProductDescriptionActivity : AppCompatActivity() {
    lateinit var product: Product


    lateinit var name: TextView
    lateinit var description: TextView
    lateinit var imageView: ImageView
    lateinit var button: Button
    lateinit var minus: Button
    lateinit var plus: Button

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_description)
        product = intent.getSerializableExtra("product") as Product

        name = findViewById(R.id.text)
        description = findViewById(R.id.descripstion)
        imageView = findViewById(R.id.image)
        name.text = product.name
        description.text = product.description


        Glide.with(this).load(product.image).into(imageView)
        button = findViewById(R.id.add_cart_btn)
        minus = findViewById(R.id.minus)
        plus = findViewById(R.id.plus)

        button.setOnClickListener {
            addProduct(product)
            Log.d("Cart", "addedProducts: ${Cart.addedProducts.size}")
        }
        minus.setOnClickListener {
            if (counter <= 0) return@setOnClickListener
            counter --
            button.text = "Добавить в корзину (${counter})"

        }

        plus.setOnClickListener {
            counter ++
            button.text = "Добавить в корзину (${counter})"
        }
    }
    private fun addProduct(product: Product) {
        if (Cart.addedProducts.isEmpty()) {
            Cart.addedProducts.add(product)
        } else {
            for (prod in ArrayList<Product>(Cart.addedProducts)) {
                if (prod.id == product.id) {
                    // Таклй продукт уже есть
                    Log.d("Cart", "Такой продукт уже есть")
                    break
                } else{
                    Cart.addedProducts.add(product)
                    //Добавить продукт
                }
            }
        }
    }
}
