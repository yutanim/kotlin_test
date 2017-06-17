package com.fours.subs.controller.api

import com.fours.subs.domain.application.Core
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.core.Response


@Path("/api")
class HomeResource @Inject constructor(val core: Core)  {


    @GET
    @Path("/root")
    fun get(): Response{
       return Response.ok("root").build()
    }

    @GET
    @Path("/user/{user_id}")
    fun fetchUser(@PathParam("user_id") userId: Int): Response{
        val user = core.userService.get(userId)
        return Response.ok(user).build()
    }

}