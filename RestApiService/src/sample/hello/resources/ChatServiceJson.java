package sample.hello.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/chatservicejson")
public class ChatServiceJson {
	  @GET
	  @Produces("application/json")
	  public Response chatServiceJson() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Chat Val", "Hi"); 
 
		String result = jsonObject.toString();
		return Response.status(200).entity(result).build();
	  }
 
	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response chatServiceJsonWithName(@PathParam("f") String f) throws JSONException {
 
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Chat Val", "Hi "+f); 
	 
			String result = jsonObject.toString();
			return Response.status(200).entity(result).build();
	  }

}
