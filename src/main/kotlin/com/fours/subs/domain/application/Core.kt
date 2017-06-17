package com.fours.subs.domain.application

import com.fours.subs.domain.domainImpl.UserDAO
import com.fours.subs.domain.entity.user.UserService
import javax.inject.Singleton


interface Core{
     val userService: UserService
}

@Singleton
class CoreImpl: Core {
    val users = UserDAO
    override val userService = UserService(users)
}