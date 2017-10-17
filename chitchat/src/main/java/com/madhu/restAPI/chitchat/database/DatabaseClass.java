package com.madhu.restAPI.chitchat.database;

import java.util.HashMap;
import java.util.Map;

import com.madhu.restAPI.chitchat.model.Message;
import com.madhu.restAPI.chitchat.model.Profile;

//Acts as a database class.Instead of using a database, created this dummy class as database.

public class DatabaseClass {
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
}
