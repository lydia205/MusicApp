package com.example.musicapp

import android.provider.MediaStore
import android.util.Log
import android.view.Display
import java.time.Year
import kotlin.time.Duration

class Song ( var songName: String, var songArtist: String,  var songYear: Int, var songDuration: String) {
    //created variable to hold song object's attributes

    var name: String = ""
    var Artist: String = ""
    var Year: Int = 0
    var Duration: String = ""

    // secondary Cconstructor 1
    constructor(songName: String, songArtist: String) : this(songName, songArtist, 0, "") {
    }

    //secondary constructor2
    constructor(songName: String, songYear: Int) : this(songName,"Unknow", songYear,"") {
    }
    //secondary constructor 3
    constructor(songName: String,songArtist: String,songYear: Int) : this(songName,songArtist,songYear,"0:00"){

    }

    //initialize variables
    init {
        name = songName
        Artist = songArtist
        Year = songYear
        Duration = songDuration
    }

    fun play() {
        Log.v("song", "$name playing now")
    }

    fun Pause() {
        Log.v("song", "$name paused now")
    }

    fun Stop() {
        Log.v("song", "$name stopped now")
    }

    fun Favourite(): Boolean {
        Log.v("song", "$name favourite now")
        return true
    }

    fun DisplaySong(): String {
        val artist = ""
        return "$name - $Artist ($Year) $Duration"
    }
}