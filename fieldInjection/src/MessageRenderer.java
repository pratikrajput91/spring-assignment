package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.*;

public class MessageRenderer{

	private MessageProvider message;

	public void setMessageProvider(MessageProvider message){
	this.message=message;
	}

	public void render() {
	System.out.println(message.getMessage());
}
}
