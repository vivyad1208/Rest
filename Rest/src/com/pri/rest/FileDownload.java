package com.pri.rest;

import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/files")
public class FileDownload {

	private static final String FILE_PATH = "c:\\myfile.txt";

	@GET
	@Path("/txt")
	@Produces("text/plain")
	public Response getFile() {
		File file = new File(FILE_PATH);
		String headerStr = "Content-Disposition";
		String headerObj = "attachment; filename=\"rest_file.txt\"";
		return Response.ok(file).header(headerStr, headerObj).build();
	}
}
