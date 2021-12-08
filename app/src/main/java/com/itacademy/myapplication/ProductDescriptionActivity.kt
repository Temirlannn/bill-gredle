package com.itacademy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ProductDescriptionActivity : AppCompatActivity() {
    lateinit var title: TextView
    lateinit var image: ImageView
    lateinit var description: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_description)
        title = findViewById(R.id.text)
        image = findViewById(R.id.image)
        button = findViewById(R.id.button)


    }
}