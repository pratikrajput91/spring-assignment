package com.capgemini.spring.renderer;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import com.capgemini.spring.provider.*;
@Component
public class MessageRenderer{

	private MessageProvider message;

	@Autowired
	public MessageRenderer(MessageProvider message){
	this.message=message;
	}
	public void render() {
	System.out.println(message.getMessage());
}
}
