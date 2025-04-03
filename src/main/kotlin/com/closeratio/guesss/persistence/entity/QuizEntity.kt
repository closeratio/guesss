package com.closeratio.guesss.persistence.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "quizzes")
class QuizEntity {
    @Id
    lateinit var id: UUID

    @Column(name = "name", nullable = false)
    lateinit var name: String

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    lateinit var owner: AccountEntity
}

