package com.mobile.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.alfandy.recyclerviewkotlin.R

class DetailSuperHeroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_super_hero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val superHero = intent.getParcelableExtra<SuperHero>(MainActivity.INTENT_PARCELABLE)

        val imageSuperHero = findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperHero = findViewById<TextView>(R.id.tv_item_name)
        val descSuperHero = findViewById<TextView>(R.id.tv_item_description)

        imageSuperHero.setImageResource(superHero?.imageSuperHero!!)
        nameSuperHero.text = superHero.nameSuperHero
        descSuperHero.text = superHero.descSuperHero

    }

    override fun onSupportNavigateUp(): Boolean{
        onBackPressed()
        return true
    }
}