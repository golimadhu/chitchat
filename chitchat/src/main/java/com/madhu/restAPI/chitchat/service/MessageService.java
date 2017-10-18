package com.madhu.restAPI.chitchat.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.madhu.restAPI.chitchat.database.DatabaseClass;
import com.madhu.restAPI.chitchat.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {
		
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		message.setCreated(new Date());
		messages.put(message.getId(), message);		
		return message;		
	}
	
	public Message updateMessage(Message message){
		if(messages.size()<=0){
			return null;
		}
		message.setCreated(new Date());
		messages.put(message.getId(),message);
		return message;
	}
	
	public Message removeMessage(long id){
		//this method returns the message instance that was removed
		return messages.remove(id);
	}
	
}
