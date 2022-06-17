package ru.netology


fun main() {
    val firstPost = Post(
        ownerId = 1,
        fromId = 5,
        createdBy = 6,
        date = 1,
        text = "щщщщщщщщщщщщщщщщщщщ",
        replyOwnerId = 1,
        replyPostId = 3,
        friendsOnly = false,
        comments = Post.Comments(),
        copyright = Post.Copyright(),
        reposts = Post.Reposts(),
        postType = Post.PostType.Post,
        views = Post.Views(),
        signerId = 1,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        donut = Post.Donut(),
        postponedId = 1,
        likes = Post.Likes()
    )

    val secondPost = Post(
        ownerId = 9,
        fromId = 2,
        createdBy = 3,
        date = 1,
        text = "ццццццццццццццццц",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = false,
        comments = Post.Comments(),
        copyright = Post.Copyright(),
        reposts = Post.Reposts(),
        postType = Post.PostType.Post,
        views = Post.Views(),
        signerId = 1,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        donut = Post.Donut(),
        postponedId = 7,
        likes = Post.Likes()
    )

    val service = WallService()
    service.add(firstPost)
    service.add(secondPost)


}

