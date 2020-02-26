package com.fuatkara;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//http://localhost:8080/RESTfulJersey/rest/main
@Path(value = "/main")
public class Index {
	
	//http://localhost:8080/RESTful-Annotation/rest/main/mainMethod/method
	@GET
	@Path(value = "/mainMethod")
	public String method_1() {
		System.out.println("Method_1");
		return "Method_1";
	}
	
	//http://localhost:8080/RESTfulJersey/rest/main/method
	@GET
	@Path(value = "/method")
	@Produces(MediaType.TEXT_PLAIN) 
	public String method_2() {
		System.out.println("Method_2");
		return "Method_2";
	}

	//http://localhost:8080/RESTfulJersey/rest/main/htmlMethod
	@GET
	@Path(value = "/htmlMethod")
	@Produces("text/html") 
	public String methodd_3() {
		System.out.println("Method_3");
		return "<h1>Method_3</h1>";
	}
	
	//http://localhost:8080/RESTfulJersey/rest/main/htmlMethod/{mParameter}
	@GET
	@Path(value = "/htmlMethod/{mParameter}")
	@Produces(MediaType.TEXT_XML)
	public Response methodd_4(@PathParam("mParameter") String mParameter) {
		System.out.println("Method_4 Parameter coming" + mParameter); 
		
		String result= "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <message>" + mParameter + "<message>";
		
		return Response.status(200).entity(result).build();
	}
	
	//http://localhost:8080/RESTfulJersey/rest/main/htmlMethod/{mP1}/{mP2}/{mP3}/{mP4}
	@GET
	@Path(value = "/htmlMethod/{mP1}/{mP2}/{mP3}/{mP4}")
	@Produces("text/plain;charset=utf-8")  
	//"text/plain" + "charset = utf-8" diyede yazabiliriz.
	public Response methodd_5(
			@PathParam("mP1") String mP1,
			@PathParam("mP2") String mP2,
			@PathParam("mP3") String mP3,
			@PathParam("mP4") String mP4,
			@PathParam("mP5") String mP5
			) { 
		
		String result= "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <message>" 
				+ mP1 + " "  
				+ mP2 + " " 
				+ mP3 + " " 
				+ mP4 + " " 
				+ mP5 + "<message>";
		return Response.status(200).entity(result).build(); 
	}
}













