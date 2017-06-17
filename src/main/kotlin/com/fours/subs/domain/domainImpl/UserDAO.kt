package com.fours.subs.domain.domainImpl

import com.fours.subs.domain.entity.user.User
import java.time.ZonedDateTime

object UserDAO{
    fun of(id: Int): User {
        return User(id, "hoge", ZonedDateTime.now())
    }
}