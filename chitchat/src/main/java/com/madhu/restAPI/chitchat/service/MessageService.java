package com.madhu.restAPI.chitchat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.madhu.restAPI.chitchat.database.DatabaseClass;
import com.madhu.restAPI.chitchat.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {
		messages.put(1L, new Message(1, "Hello World", "madhu"));
		messages.put(2L, new Message(2, "Hello Jersey", "madhu"));
		messages.put(3L, new Message(3, "Hello restAPI", "madhu"));
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;		
	}
	
	public Message updateMessage(Message id, Message message){
		if(messages.size()<=0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(Message id){
		//this method returns the message instance that was removed
		return messages.remove(id);
	}
	
}
