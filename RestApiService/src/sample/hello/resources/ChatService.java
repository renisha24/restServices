package sample.hello.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/chatservice")
public class ChatService {
	@GET
	@Produces("application/xml")
	public String selfChat(){
		String result="Hello";
		return  "<ChatService>" +"<ChatServiceOut>" + result + "</ChatServiceOut>" + "</ChatService>";
	}
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String selfChatForHi(@PathParam("c") String c) {
		String result="Hi "+c+" "+"How are you doing?";
		return "<ChatService>" +"<ChatServiceOut>" + result + "</ChatServiceOut>" + "</ChatService>";
	}
}
