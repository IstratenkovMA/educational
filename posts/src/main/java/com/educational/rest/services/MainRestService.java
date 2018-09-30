package com.educational.rest.services;

import com.educational.rest.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author miis0317
 * @date 04-07-18
 */
@Path("/posts")
public class MainRestService implements RestService {

    @GET
    @Path("/echo")
//    @Override
    public String echo(String a) {
        return a;
    }
}
