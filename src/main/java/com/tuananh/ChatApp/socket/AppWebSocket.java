package com.tuananh.ChatApp.socket;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.tuananh.ChatApp.socket.handler.MyTextHandler;

@Configuration
@EnableAutoConfiguration
@EnableWebSocket
public class AppWebSocket implements WebSocketConfigurer{

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addHandler(new MyTextHandler(), "/text").withSockJS();
		
		
	}
	
}
