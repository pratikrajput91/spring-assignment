package com.capgemini.spring.provider;
import com.capgemini.spring.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
@Component("hw")
public class HWMessageProvider implements MessageProvider{
	public String getMessage(){
	return "Hello World";
}
}