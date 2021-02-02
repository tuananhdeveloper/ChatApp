package com.tuananh.ChatApp.socket;

public class StatusMessage {
	
	private enum Status {
		ONLINE, OFFLINE
	}
	
	private int idUser;
	private Status status;
	
	public StatusMessage(int idUser, Status status) {
		this.idUser = idUser;
		this.status = status;
	}
	
	public int getIdUser() {
		return idUser;
	}
	
	public Status getStatus() {
		return status;
	}
	
}
