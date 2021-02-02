package com.tuananh.ChatApp.socket;

public class ChatMessage {
	private int idSender;
	private int idReceiver;
	private MessageType messageType;
	private String content;
	
	public ChatMessage(int idSender, int idReceiver, MessageType messageType, String content) {
		super();
		this.idSender = idSender;
		this.idReceiver = idReceiver;
		this.messageType = messageType;
		this.content = content;
	}

	public int getIdSender() {
		return idSender;
	}

	public int getIdReceiver() {
		return idReceiver;
	}

	public MessageType getMessageType() {
		return messageType;
	}

	public String getContent() {
		return content;
	}
	
	
}
