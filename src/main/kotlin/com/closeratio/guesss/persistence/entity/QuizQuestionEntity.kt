package com.closeratio.guesss.persistence.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "quiz_questions")
class QuizQuestionEntity {
    @Id
    lateinit var id: UUID

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    lateinit var quiz: QuizEntity

    @Column(name = "question", nullable = false)
    lateinit var question: String

    @Column(name = "answer", nullable = false)
    lateinit var answer: String
}