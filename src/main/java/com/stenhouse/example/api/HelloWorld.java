package com.stenhouse.example.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jason on 12/27/15.
 */
public class HelloWorld {

    public HelloWorld() {
        // Jackson deserialization
    }

    @JsonProperty
    public String getSaying(){
        return "Hello, World!";
    }
}
