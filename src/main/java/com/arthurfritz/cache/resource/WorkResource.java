package com.arthurfritz.cache.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class WorkResource {

    @GET
    public String work() {
        return "I am works";
    }
}
