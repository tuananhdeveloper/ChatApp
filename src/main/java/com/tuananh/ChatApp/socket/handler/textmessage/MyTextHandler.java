package com.tuananh.ChatApp.socket.handler.textmessage;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.google.gson.Gson;
import com.tuananh.ChatApp.socket.AppWebSocket;
import com.tuananh.ChatApp.socket.ChatMessage;
import com.tuananh.ChatApp.socket.StatusMessage;

public class MyTextHandler extends TextWebSocketHandler{
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message){
		// TODO Auto-generated method stub
		
		String msg = message.toString();
		Gson gson = new Gson();
		
		try {
		    Object o = gson.fromJson(msg, Object.class);
		    MessageContext context = null;
		    if(o instanceof ChatMessage) {
		    	context = new MessageContext(new ChatMessageHandler(session));
		    }
		    else if(o instanceof StatusMessage) {
		    	context = new MessageContext(new StatusMessageHandler(session));
		    }
		    
		    context.handle();
		} catch (Exception e) {
		    System.out.println("Invalid json format");
		}
		
		gson.fromJson(msg, StatusMessage.class);

	}
	
}
