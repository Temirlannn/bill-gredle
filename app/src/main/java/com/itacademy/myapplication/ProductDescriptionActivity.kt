package com.itacademy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.ConditionVariable
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.itacademy.myapplication.model.Cart
import com.itacademy.myapplication.model.Product

class ProductDescriptionActivity : AppCompatActivity() {
    lateinit var title: TextView
    lateinit var image: ImageView
    lateinit var description: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_description)
        var product = intent.getSerializableExtra("product") as Product

        title = findViewById(R.id.text)
        image = findViewById(R.id.image)
        button = findViewById(R.id.button)
        description = findViewById(R.id.descripstion)

        title.text = product.name
        Glide.with(this).load(product.image).into(image)
        description.text = product.description
        button.setOnClickListener {
            addElementToCart(product)
        }
    }

    fun addElementToCart(product: Product){
        if(Constants.cart.size == 0){
            Constants.cart.add(Cart(1,product))
        }else{
            for (item in Constants.cart){
                if (item.product == product){
                    val index = Constants.cart.indexOf(item)
                    Constants.cart[index].amount += 1
                }else{
                    Constants.cart.add(Cart(1, product))
                }
            }
        }
        Log.i("Cart", Constants.cart.toString())
    }
}