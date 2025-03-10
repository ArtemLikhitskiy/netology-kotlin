package com.likhitskiy.netologykotlin.OOP

data class Audio(
    val id : Int,
    val owner_id : Int,
    val artist : String,
    val title : String,
    val duration : Int,
    val url : String,
    val lyrics_id : Int,
    val album_id : Int,
    val genre_id : Int,
    val date : Int,
    val no_search : Int,
    val is_hq : Int,
)
