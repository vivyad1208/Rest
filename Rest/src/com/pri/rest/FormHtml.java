package com.pri.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/form")
public class FormHtml {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayPlainHtmlHello() {
		return new StringBuilder("<html><body>")
			.append("<form action='product/add' method='post' >")
			.append("Enter Id:<input type=\"text\" name=\"id\"/><br/><br/>")
			.append("Enter Name:<input type=\"text\" name=\"name\"/><br/><br/>")
			.append("Enter Price:<input type=\"text\" name=\"price\"/><br/><br/>")
			.append("<input type=\"submit\" value=\"Add Product\"/>  ")
			.append("</body></html>").toString();
	}

}
