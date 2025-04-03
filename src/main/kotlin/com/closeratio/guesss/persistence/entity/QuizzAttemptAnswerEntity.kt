package com.closeratio.guesss.persistence.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "quiz_attempt_answers")
class QuizzAttemptAnswerEntity {
    @Id
    lateinit var id: UUID

    @ManyToOne
    @JoinColumn(name = "attempt_id", nullable = false)
    lateinit var attempt: QuizAttemptEntity

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    lateinit var question: QuizQuestionEntity

    @Column(name = "answer", nullable = false)
    lateinit var answer: String


}