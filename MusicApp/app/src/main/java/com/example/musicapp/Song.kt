package com.example.musicapp

import android.provider.MediaStore
import android.util.Log
import java.time.Year
import kotlin.time.Duration

class Song (SongName: String, songArtist: String, songYear: Int,songDuration: String){
    //created variable to hold song object's attributes
    var name: String = ""
    var Artist: String = ""
    var Year: Int = 0
    var Duration: String = ""

    constructor(songName: String, songArtists: String) : this(songName, songArtists, 0,"")
    }

    //initialisAing variables
    init {
        name  = songName
        Artist = songArtist
        year = songYear
        Duration = songDuration
    }

fun play () {
    Log.v("song", "$name" playing now")
}
