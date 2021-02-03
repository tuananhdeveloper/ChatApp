package com.tuananh.ChatApp.socket.handler.textmessage;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.google.gson.Gson;

public class MyTextHandler extends TextWebSocketHandler{
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws ParseException{
		// TODO Auto-generated method stub
		
		String msg = message.getPayload().toString();
		JSONObject jsonObject = (JSONObject) new JSONParser().parse(msg);
		String type = (String) jsonObject.get("type");
		String value = jsonObject.get("value").toString();
		
		System.out.println("type: " + type);
		MessageContext context = null;
		switch(type) {
		case "status_message":
			context = new MessageContext(new StatusMessageHandler(session, value));
			break;
		case "chat_message":
			context = new MessageContext(new ChatMessageHandler(session));
			break;
		}
		context.handle();
	}
	
}
