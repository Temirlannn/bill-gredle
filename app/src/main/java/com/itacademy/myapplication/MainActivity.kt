package com.itacademy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.itacademy.myapplication.adapters.ProductAdapter
import com.itacademy.myapplication.model.Cart
import com.itacademy.myapplication.model.Product

class MainActivity : AppCompatActivity() {
    val listProduct = arrayListOf<Product>()
    lateinit var  recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView2)
        listProduct.add(
            Product( "Сумка",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvPzOgbbgYJ8YPESiVpFE27vT95nm7FXehdQ&usqp=CAU",
            700.0,"grbrbr", 50)
        )
        listProduct.add(
            Product( "сумка",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnxga3iht3nKkb9grf69KcUa9zA3TEHo9f7Q&usqp=CAU",
                800.0,"bfbfbfbf",43)
        )
        listProduct.add(
            Product( "Сумка",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWEWjOKz1pdyIYIHrsVLu1eB1qhlhdRHWa_Q&usqp=CAU",
                900.0,"eggeg",50)
        )
        recyclerView.adapter = ProductAdapter(listProduct)
    }
}