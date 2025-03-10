package com.likhitskiy.netologykotlin.OOP

data class Note(
    val id : Int,
    val owner_id : Int,
    val title : String,
    val text : String,
    val date : Int,
    val comments : Int,
    val readComments : Int,
    val viewUrl : String,
    val privacyView : String,
    val privacyComment : String,
    val canComment : Boolean,
    val textWiki : String
)
