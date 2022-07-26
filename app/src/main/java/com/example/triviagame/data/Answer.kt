package com.example.triviagame.data


data class Answer(var answerString: String) {
    var isClicked: Boolean = false
    var isCorrect: Boolean = false
}