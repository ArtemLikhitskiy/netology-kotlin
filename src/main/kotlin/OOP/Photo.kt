package com.likhitskiy.netologykotlin.OOP

data class Photo(
    val id : Int,
    val albumId : Int,
    val ownerId : Int,
    val userId : Int,
    val text : String,
    val date : Int,
    val sizes : Array<Sizes> = emptyArray(),
    val width : Int,
    val height : Int
)
