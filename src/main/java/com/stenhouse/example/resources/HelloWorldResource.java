package com.stenhouse.example.resources;

import com.codahale.metrics.annotation.Timed;
import com.stenhouse.example.api.HelloWorld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jason on 12/27/15.
 */
@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    @GET
    @Timed
    public HelloWorld sayHelloWorld() {
        return new HelloWorld();
    }
}
