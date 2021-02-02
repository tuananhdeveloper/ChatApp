package com.tuananh.ChatApp.socket.handler.textmessage;

public class MessageContext {
	private Message message;

	public MessageContext(Message message) {
		super();
		this.message = message;
	}
	
	public void handle() {
		message.handle();
	}
}
