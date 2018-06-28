package com.pri.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/consume/student")
public class StudentConsumes {


	@POST
	@Path("/xml")
	@Consumes(MediaType.APPLICATION_XML)
	public void consumeXmlRequest(Student s) {
		System.out.println("**Received XML request**");
		System.out.println(" Name : " + s.getName());
		System.out.println(" Age  : " + s.getAge());
	}


	@POST
	@Path("/json")
	@Consumes(MediaType.APPLICATION_JSON)
	public void consumeJSONRequest(Student s) {
		System.out.println("**Received JSON request**");
		System.out.println(" Name : " + s.getName());
		System.out.println(" Age  : " + s.getAge());
	}
}
