package com.tuananh.ChatApp.socket.handler.textmessage;

public class MessageContext {
	private MessageHandler handler;
	
	public MessageContext(MessageHandler handler) {
		super();
		this.handler = handler;
	}



	public void handle() {
		handler.handle();
	}
}
