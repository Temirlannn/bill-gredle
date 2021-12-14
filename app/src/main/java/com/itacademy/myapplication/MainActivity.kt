package com.itacademy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.itacademy.myapplication.model.ProductAdapter
import com.itacademy.myapplication.model.Product

class MainActivity : AppCompatActivity() {
    val listProduct = arrayListOf<Product>()
    lateinit var  recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView2)
        listProduct.add(
            Product(
                0,
                "Ичиго",
                "https://w7.pngwing.com/pngs/417/220/png-transparent-ichigo-kurosaki-bleach-versus-crusade-anime-bleach-manga-cartoon-fictional-character.png",
                500.0,
                "имя героя",
                55
            )
        )

        listProduct.add(
            Product(
                1,
                "Ренджи",
                "https://upload.wikimedia.org/wikipedia/ru/5/51/Renji_Abarai.jpg",
                500.0,
                "имя героя",
                12
            )
        )

        listProduct.add(
            Product(
                2,
                "Хитсугая",
                "https://animecult.org/uploads/attachment/cover/10513/characters_8354.jpg",
                500.0,
                "имя героя",
                66

            )
        )

        listProduct.add(
            Product(
                3,
                "Улькиора",
                "https://w7.pngwing.com/pngs/983/904/png-transparent-undertale-brazil-mangaka-ulquiorra-cifer-ken-games-ulquiorra-mammal-black-hair-text-thumbnail.png",
                500.0,
                "имя героя",
                77

            )
        )

        listProduct.add(
            Product(
                4,
                "Гримджоу",
                "https://fanfics.me/images/fandoms_heroes/13534-1564167491.jpg",
                500.0,
                "имя героя",
                88
            )
        )

        recyclerView.adapter = ProductAdapter(listProduct)

    }
}