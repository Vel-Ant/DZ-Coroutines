package ru.netology.coroutines.dto

data class CommentWithAuthors (
    val comment: Comment,
    val author: List<Author>,
)
