package com.capgemini.spring.provider;
import com.capgemini.spring.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component("gm")
public class GMMessageProvider implements MessageProvider{
	public String getMessage(){
	return "Good Morning";
}
}