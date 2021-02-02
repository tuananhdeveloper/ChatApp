package com.tuananh.ChatApp.socket.handler.binarymessage;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;

public class MyBinaryHandler extends BinaryWebSocketHandler{
	@Override
	protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws Exception {
		// TODO Auto-generated method stub
		super.handleBinaryMessage(session, message);
	}
}
