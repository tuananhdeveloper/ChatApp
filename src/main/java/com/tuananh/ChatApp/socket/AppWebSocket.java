package com.tuananh.ChatApp.socket;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.tuananh.ChatApp.socket.handler.binarymessage.MyBinaryHandler;
import com.tuananh.ChatApp.socket.handler.textmessage.MyTextHandler;

@Configuration
@EnableAutoConfiguration
@EnableWebSocket
public class AppWebSocket implements WebSocketConfigurer{

	public static Map<String, WebSocketSession> clients = new HashMap<>();
	
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addHandler(new MyTextHandler(), "/text");
		registry.addHandler(new MyBinaryHandler(), "/binary");
		
	}
	
}
