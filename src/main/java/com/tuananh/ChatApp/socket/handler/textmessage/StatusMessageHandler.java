package com.tuananh.ChatApp.socket.handler.textmessage;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.google.gson.Gson;
import com.tuananh.ChatApp.socket.StatusMessage;

public class StatusMessageHandler implements MessageHandler {
	
	private WebSocketSession session;
	private String value;
	
	public StatusMessageHandler(WebSocketSession session, String value) {
		// TODO Auto-generated constructor stub
		this.session = session;
		this.value = value;
	}
	
	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println(value);
		StatusMessage statusMessage = new Gson().fromJson(value, StatusMessage.class);
		
		System.out.println("idUser" + statusMessage.getIdUser());
		try {
			session.sendMessage(new TextMessage("OK"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
