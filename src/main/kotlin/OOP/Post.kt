package com.likhitskiy.netologykotlin.OOP23

import com.likhitskiy.netologykotlin.OOP.Attachment
import com.likhitskiy.netologykotlin.OOP.Geo
import com.likhitskiy.netologykotlin.OOP.PostSource

data class Post(
    var id : Long = 0,
    val ownerId : Long,
    val fromId : Long,
    val createdBy : Long,
    val date : Long,
    val text : String,
    val replyOwnerId : Long,
    val replyPostId : Long,
    val friendsOnly : Boolean,
    val comments : Comments,
    val copyright : Copyright,
    val likes : Likes,
    val reposts : Reposts,
    val views : Views,
    val postType : String,
    val postSource : PostSource?,
    val attachments : Array<Attachment>? = emptyArray(),
    val geo : Geo?,
    val signerId : Long,
    val copyHistory : Array<Post>? = emptyArray(),
    val canPin : Boolean,
    val canDelete : Boolean,
    val canEdit : Boolean,
    val isPinned : Boolean,
    val markedAsAds : Boolean,
    val isFavorite : Boolean,
    val donut : Donut,
    val postponedId : Long
)
