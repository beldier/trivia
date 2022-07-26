package com.example.triviagame.repository

import com.example.triviagame.data.Answer
import com.example.triviagame.data.Question

object GameRepository {
    fun generateQuestions(): MutableList<Question> {
        return mutableListOf(
            Question(
                "Whats the most popular language for android ? ",
                listOf(
                    Answer("Kotlin"),
                    Answer("Python"),
                    Answer("Java"),
                    Answer("C++"),
                    Answer("Ruby")
                )
            ),
            Question(
                "Whats does MVVM stand for ?  ",
                listOf(
                    Answer("Model view-view model"),
                    Answer("A group music"),
                    Answer("A language"),
                    Answer("Device name"),
                    Answer("Country")
                )
            ),
            Question(
                "Where do we use safe args ",
                listOf(
                    Answer("in services"),
                    Answer("in repositories"),
                    Answer("in communication between fragments"),
                    Answer("All of them "),
                    Answer("Whats that ? ")
                )
            )
        )
    }
}