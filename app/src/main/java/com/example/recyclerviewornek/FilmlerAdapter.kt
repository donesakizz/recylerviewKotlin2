package com.example.recyclerviewornek

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewornek.databinding.CardFilmTasarimBinding

class FilmlerAdapter(private val mContext:Context, private val filmlerListesi: List<Filmler>):RecyclerView.Adapter<FilmlerAdapter.CardTasarimNesneleriTutucu>() {

    inner class CardTasarimNesneleriTutucu(val binding: CardFilmTasarimBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneleriTutucu {

        val binding = CardFilmTasarimBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CardTasarimNesneleriTutucu(binding)

    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriTutucu, position: Int) {
        val film = filmlerListesi[position]

        val binding = holder.binding

        binding.textViewFilmBaslik.text = film.filmAd
        binding.textViewFilmFiyat.text = "${film.filmFiyat} TL"

        val resimId = mContext.resources.getIdentifier(film.filmResimAd,"drawable",mContext.packageName)

        binding.imageViewFilmResim.setImageResource(resimId)

        binding.buttonSepeteEkle.setOnClickListener {
            Toast.makeText(mContext, "${film.filmAd} sepete eklendi" , Toast.LENGTH_SHORT).show()
        }

    }
}