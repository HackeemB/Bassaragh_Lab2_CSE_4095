package com.example.a2022_01_26.controllers
import com.example.a2022_01_26.model.AllQuestions

class NextQuestion {
    private val allQuestions: AllQuestions = AllQuestions()

    private var question: Int = 0
    private val total_qs: Int = allQuestions.allQuestions.size

    public fun linearNextQuestion(): Int {
        question = (question  + 1) % total_qs
        return allQuestions.allQuestions[question].index
    }

    public fun isCorrect(): Boolean {
        return allQuestions.allQuestions[question].isTrue
    }

    public fun psuedoRandomNextQuestion(): Int {
        question = (question  + 1) % total_qs
        return allQuestions.allQuestions[question].index
    }
}