package com.fours.subs.domain.entity.user

import java.time.ZonedDateTime

data class User(
        val id: Int,
        val name: String?,
        val createdAt: ZonedDateTime)