package com.closeratio.guesss.persistence.entity

import jakarta.persistence.*
import jakarta.persistence.EnumType.STRING
import java.util.*

@Entity
@Table(name = "quiz_attempts")
class QuizAttemptEntity {
    @Id
    lateinit var id: UUID

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    lateinit var quiz: QuizEntity

    @ManyToOne
    @JoinColumn(name = "participant_id", nullable = false)
    lateinit var participant: AccountEntity

    @Enumerated(STRING)
    @Column(name = "status", nullable = false)
    lateinit var status: AttemptStatus
}

