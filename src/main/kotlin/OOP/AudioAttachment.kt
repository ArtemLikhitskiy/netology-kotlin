package com.likhitskiy.netologykotlin.OOP

class AudioAttachment(param : Audio) : Attachment {
    override val type: String = "audio"
    val audio = param

    override fun toString() : String{
        return "\n  $audio"
    }
}
