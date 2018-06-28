package com.pri.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Plain Text!";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayPlainHtmlHello() {
		return "<h1>Hello Plain Text!</h1>";
	}
}