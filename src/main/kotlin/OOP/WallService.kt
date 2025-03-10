package com.likhitskiy.netologykotlin.OOP

data class Likes(var count: Int = 0)

data class Comments(
    var count: Int = 0,
    var canPost: Boolean = true,
    var canClose: Boolean = false
)

data class Repost(
    var count: Int,
    var canRepost: Boolean
)

data class Post(
    val id: Int,
    val ownerId: Int,
    val text: String,
    val like: Likes,
    val views: Int = 0,
    val comments: Comments,
    val repost: Repost,
    val canEdit: Boolean,
    val canDelete: Boolean
)

object WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 0

    fun clear() {
        posts = emptyArray()
        lastId = 0
    }

    fun add(post: Post): Post {
        posts += post.copy(
            id = ++lastId,
            like = post.like.copy(),
            comments = post.comments.copy(),
            repost = post.repost.copy()
        )
        return posts.last()
    }

    fun update(updatedPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == updatedPost.id) {
                posts[index] = updatedPost.copy(like = post.like.copy(),
                    comments = post.comments.copy(),
                    repost = post.repost.copy())
                return true
            }
        }
        return false
    }

    fun lookPost() {
        for (post in posts) {
            println()
            println(post)
        }
    }
}

fun main() {
    WallService.add(
        Post(
            1,
            1_1,
            "Текст поста",
            like = Likes(),
            comments = Comments(),
            repost = Repost(1, true),
            canEdit = true,
            canDelete = false
        )
    )

    WallService.add(
        Post(
            2,
            2_2,
            "Новый текст поста",
            like = Likes(count = +1),
            comments = Comments(),
            repost = Repost(count = +1, true),
            canEdit = true,
            canDelete = true
        )
    )

    WallService.lookPost()

    WallService.update(
        Post(
            1,
            3_3,
            "Обновленный текст поста",
            like = Likes(),
            comments = Comments(),
            repost = Repost(1, true),
            canEdit = true,
            canDelete = true
        )
    )

    WallService.lookPost()
}