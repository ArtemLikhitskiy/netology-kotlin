import com.likhitskiy.netologykotlin.OOP.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun updateTrue() {
        val service = WallService

        service.add(
            Post(
                1,
                2222,
                "text post",
                comments = Comments(0, true, false),
                like = Likes(0),
                repost = Repost(1, true),
                canEdit = true,
                canDelete = true
            )
        )
        service.add(
            Post(
                2,
                2222,
                "text post new",
                comments = Comments(1, true, false),
                like = Likes(1),
                repost = Repost(0, false),
                canEdit = true,
                canDelete = true
            )
        )
        service.add(
            Post(
                3,
                2222,
                "text post №3",
                comments = Comments(3, true, false),
                like = Likes(10),
                repost = Repost(11, true),
                canEdit = true,
                canDelete = true
            )
        )

        val update = Post(
            1,
            2222,
            "update text post",
            comments = Comments(0, true, false),
            like = Likes(0),
            repost = Repost(1, true),
            canEdit = true,
            canDelete = true
        )

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        val service = WallService

        service.add(
            Post(
                1,
                2222,
                "text post",
                comments = Comments(0, true, false),
                like = Likes(0),
                repost = Repost(1, true),
                canEdit = true,
                canDelete = true
            )
        )
        service.add(
            Post(
                2,
                2222,
                "text post new",
                comments = Comments(1, true, false),
                like = Likes(1),
                repost = Repost(0, false),
                canEdit = true,
                canDelete = true
            )
        )
        service.add(
            Post(
                3,
                2222,
                "text post №3",
                comments = Comments(3, true, false),
                like = Likes(10),
                repost = Repost(11, true),
                canEdit = true,
                canDelete = true
            )
        )
        val update = Post(
            11,
            2222,
            "update text post",
            comments = Comments(0, true, false),
            like = Likes(0),
            repost = Repost(1, true),
            canEdit = true,
            canDelete = true
        )

        val result = service.update(update)

        assertFalse(result)
    }

    @Test
    fun addPost() {
        val service = WallService

        val result = service.add(
            Post(
                1,
                2222,
                "post add",
                comments = Comments(1, true, false),
                like = Likes(1),
                repost = Repost(0, false),
                canEdit = true,
                canDelete = true
            )
        )
        assertNotEquals(0, result.id)
    }
}
