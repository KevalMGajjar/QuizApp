package com.example.quizapp.modalClass

data class Question(
    val id: Int,
    val image: Int,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctOption: Int
)
