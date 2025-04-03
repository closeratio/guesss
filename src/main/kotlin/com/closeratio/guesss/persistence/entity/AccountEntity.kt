package com.closeratio.guesss.persistence.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "accounts")
class AccountEntity {
    @Id
    lateinit var id: UUID

    @Column(name = "username", nullable = false)
    lateinit var username: String

    @Column(name = "nickname", nullable = false)
    lateinit var nickname: String

    @OneToMany(mappedBy = "owner")
    lateinit var quizzes: List<QuizEntity>
}

