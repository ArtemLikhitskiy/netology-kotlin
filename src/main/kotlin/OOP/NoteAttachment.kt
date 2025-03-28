package com.likhitskiy.netologykotlin.OOP

class NoteAttachment(param : Note) : Attachment {
    override val type: String = "note"
    val note = param

    override fun toString() : String{
        return "\n  $note"
    }
}
