package com.example.musicapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import  com.example.musicapp.Song

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var songShowTxt = findViewById<TextView>(R.id.songDisplayId)
        var songDisplay = ""

        //accessing the Song class to populate song objects with specific attributes
        var  song1 = Song("Choosi'Texas", "Ella langley", 2026)
        var  song2 = Song("Man I Need", "Olivia Deam", 2026)
        var  song3 = Song("I just Might", "Bruno Mars")

        //





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}