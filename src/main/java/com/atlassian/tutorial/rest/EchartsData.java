package com.atlassian.tutorial.rest;

import com.atlassian.plugins.rest.common.security.AnonymousAllowed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * A resource of message.
 */
@Path("/echarts")
public class EchartsData {

    @GET
    @Path("/message")
    @AnonymousAllowed
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getMessage()
    {
       return Response.ok(new EchartsDataModel("Hello World")).build();
    }

    @GET
    @Path("/async")
    @Produces({MediaType.APPLICATION_JSON})
    public Response async()
    {
        String json = "{\n" +
                "  \"categories\": [\"衬衫\",\"羊毛衫\",\"雪纺衫\",\"裤子\",\"高跟鞋\",\"袜子\"],\n" +
                "  \"data\": [5, 20, 36, 10, 10, 20]\n" +
                "}";
        return Response.ok(json).build();
    }
}