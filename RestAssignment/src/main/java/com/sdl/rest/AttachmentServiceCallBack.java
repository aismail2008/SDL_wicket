package com.sdl.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.json.JSONObject;

@Path("/calculator")
public class AttachmentServiceCallBack {
	@POST
	@Path("/multi")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response multi(String data) {
		JSONObject result = null;
		try {
			result = new JSONObject(data);
			Long a = Long.valueOf(result.getString("a"));
			Long b = Long.valueOf(result.getString("b"));
			
			result = new JSONObject();
			result.put("RESULT", "success multi");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.status(Status.OK).entity(result.toString()).build();
	}
	
	@POST
	@Path("/multi2")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response multi2(@QueryParam("param1") String p1, @QueryParam("param2") String p2)  {
		JSONObject result = new JSONObject();
		try {
			result.put("RESULT", "success multi2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.status(Status.OK).entity(result.toString()).build();
	}
	
	@GET
	@Path("/multi3")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response multi3(@QueryParam("param1") String p1, @QueryParam("param2") String p2)  {
		JSONObject result = new JSONObject();
		try {
			result.put("RESULT", "success multi3");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.status(Status.OK).entity(result.toString()).build();
	}
	
//	@GET
//	@Path("/minus/{param1}/{param2}")
//	@Produces({ MediaType.APPLICATION_JSON })
//	@Consumes({ MediaType.APPLICATION_JSON })
//	public Response minus(@PathParam("param1") String p1, @PathParam("param2") String p2) {
//		JSONObject result = null;
//		try {
//			result = new JSONObject();
//			
//			result = new JSONObject();
//			result.put("RESULT", Long.valueOf(p1) - Long.valueOf(p2));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return Response.status(Status.OK).entity(result.toString()).build();
//	}
//	
//	@GET
//	@Path("/add")
//	@Produces({ MediaType.APPLICATION_JSON })
//	@Consumes({ MediaType.APPLICATION_JSON })
//	public Response add(@QueryParam("param1") String p1, @QueryParam("param2") String p2) {
//		JSONObject result = null;
//		try {
//			result = new JSONObject();
//			
//			result = new JSONObject();
//			result.put("RESULT", Long.valueOf(p1) + Long.valueOf(p2));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return Response.status(Status.OK).entity(result.toString()).build();
//	}
}