package com.tuananh.ChatApp.socket.handler.textmessage;

import java.io.IOException;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

public class StatusMessageHandler implements Message {
	
	private WebSocketSession session;
	public StatusMessageHandler(WebSocketSession session) {
		// TODO Auto-generated constructor stub
		this.session = session;
	}
	
	@Override
	public void handle() {
		// TODO Auto-generated method stub
		try {
			session.sendMessage(new TextMessage("OK"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
