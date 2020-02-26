package com.fuatkara;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

//http://localhost:8080/RESTfulJersey/rest/member/userName
@Path(value = "/member")
public class MemberService {
	 
	@POST
	@Path(value = "/entry")
	@Produces("text/html;charset=utf-8")  
	
	//Adresten Gelse Path kullanicaz fakat bize jspden geliyor o zaman form kullanicaz.
	public Response method(@FormParam("userName") String userName) {
		System.out.println("Entry comes from the parameter(form)" + userName); 
		String result= "<h1>" + userName + "</h1>";
		
		return Response.status(200).entity(result).build();
	}
}
