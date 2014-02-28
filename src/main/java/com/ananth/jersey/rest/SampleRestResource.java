package com.ananth.jersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/sample")
public class SampleRestResource {
	
	@GET
	@Path("/hello")
	public Response sayHello() {
		String output = "Your first Jersey REST application says, Hello!";
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/hello/{message}")
	public Response sayHello(@PathParam("message") String msg) {
		String output = "Welcome: " + msg;
		return Response.status(200).entity(output).build();
	}

}
