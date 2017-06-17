package com.fours.subs.domain.entity.user

import com.fours.subs.domain.domainImpl.UserDAO


class UserService(val user: UserDAO) {
    fun get(id: Int): User {
        return user.of(id)
    }
}