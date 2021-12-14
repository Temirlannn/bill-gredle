package com.itacademy.myapplication.model

import java.io.Serializable

data class Product(
    var id: Int,
    var name: String,
    var image: String,
    var price: Double,
    var description: String,
    var amount: Int
) : Serializable
