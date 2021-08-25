package com.example.android.marsphotos

data class Photo(

    val earth_date: String,
    val id: Int,
    val img_src: String,
    val rover: Rover,
    val sol: Int
)