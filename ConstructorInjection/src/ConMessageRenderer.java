package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.*;

public class ConMessageRenderer{

	private MessageProvider message;

	public ConMessageRenderer(MessageProvider message){
	this.message=message;
	}
	public void render() {
	System.out.println(message.getMessage());
}
}
