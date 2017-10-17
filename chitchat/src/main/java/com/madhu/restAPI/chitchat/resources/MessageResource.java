package com.madhu.restAPI.chitchat.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.madhu.restAPI.chitchat.model.Message;
import com.madhu.restAPI.chitchat.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageService= new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}

}
