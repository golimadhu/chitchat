package com.madhu.restAPI.chitchat.database;

import java.util.HashMap;
import java.util.Map;

import com.madhu.restAPI.chitchat.model.Message;
import com.madhu.restAPI.chitchat.model.Profile;

//Acts as a database class.Instead of using a database, created this dummy class as database.

public class DatabaseClass {
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	static{
		messages.put(1L, new Message(1, "Hello World", "madhu"));
		messages.put(2L, new Message(2, "Hello Jersey", "madhu"));
		
		profiles.put("madhu sudan", new Profile(1,"madhu sudan","madhu","sudan"));
		profiles.put("madhu goli", new Profile(2,"madhu goli","madhu","goli"));
		
	}
	public static Map<Long, Message> getMessages() {
		
		return messages;
	}

	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
}
