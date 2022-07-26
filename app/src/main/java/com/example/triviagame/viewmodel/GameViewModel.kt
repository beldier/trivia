package com.example.triviagame.viewmodel

import androidx.lifecycle.ViewModel
import com.example.triviagame.data.Question
import com.example.triviagame.repository.GameRepository

class GameViewModel : ViewModel() {

    private var questionList: MutableList<Question> = mutableListOf()
    private var index = 0
    private var score = 0

    init {
        questionList = GameRepository.generateQuestions()
    }

    fun nextQuestion(): Question? {
        if (index >= questionList.size) return null
        return questionList[index++]
    }
    fun answerClicked(answerString:String){
        var selectedAnswer = questionList[index].answerList.find { it.answerString == answerString }
        selectedAnswer?.let{
            it.isClicked = !it.isClicked
        }
    }

}