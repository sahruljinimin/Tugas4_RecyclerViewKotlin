package com.mobile.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alfandy.recyclerviewkotlin.R

class SuperheroAdapter(private val context: Context, private val superhero: List<SuperHero>, val listener: (SuperHero) -> Unit)
    : RecyclerView.Adapter<SuperheroAdapter.SuperheroViewHolder>(){
    class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imageSuperHero = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperHero = view.findViewById<TextView>(R.id.tv_item_name)
        val descSuperHero = view.findViewById<TextView>(R.id.tv_item_description)

        fun binView(superhero: SuperHero, listener: (SuperHero) -> Unit){
            imageSuperHero.setImageResource(superhero.imageSuperHero)
            nameSuperHero.text = superhero.nameSuperHero
            descSuperHero.text = superhero.descSuperHero
            itemView.setOnClickListener{
                listener(superhero)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.binView(superhero[position], listener)
    }

    override fun getItemCount(): Int = superhero.size
    }
