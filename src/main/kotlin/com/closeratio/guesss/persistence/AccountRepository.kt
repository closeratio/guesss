package com.closeratio.guesss.persistence

import com.closeratio.guesss.persistence.entity.AccountEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface AccountRepository: JpaRepository<AccountEntity, UUID>