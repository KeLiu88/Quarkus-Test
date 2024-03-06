package com.example

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/api/hellokotlin")
class HelloWorld {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello from RESTEasy Reactive(hi,from here!!!)"
}