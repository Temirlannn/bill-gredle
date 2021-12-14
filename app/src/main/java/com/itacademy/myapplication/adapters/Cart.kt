package com.itacademy.myapplication.adapters

import com.itacademy.myapplication.model.Product

///модель корзин
data class Cart(
    var amount: Int,
    val product: Product
)
