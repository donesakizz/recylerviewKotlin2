package com.example.recyclerviewornek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewornek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  filmlerArrayList: ArrayList<Filmler>
    private lateinit var adapter: FilmlerAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val f1 = Filmler(1,"Kel Oğlan" ,"images_bir",54.6)
        val f2 = Filmler(2,"Taş Devri" ,"images_iki",90.1)
        val f3 = Filmler(1,"Casper" ,"images_uc",78.9)
        val f4 = Filmler(1,"Red Kit" ,"images_dort",34.0)
        val f5 = Filmler(1,"Garfield" ,"images_bes",65.8)
        val f6 = Filmler(1,"Tom ve Jerry" ,"images_alti",89.3)

        filmlerArrayList = ArrayList<Filmler>()

        filmlerArrayList.add(f1)
        filmlerArrayList.add(f2)
        filmlerArrayList.add(f3)
        filmlerArrayList.add(f4)
        filmlerArrayList.add(f5)
        filmlerArrayList.add(f6)

        adapter = FilmlerAdapter(this,filmlerArrayList)
        binding.rv.adapter = adapter
    }
}