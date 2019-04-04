package com.capgemini.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.capgemini.spring.renderer.*;
import com.capgemini.spring.provider.*;
	
	@Configuration
	public class ConfigurationDemo {
 
	@Bean
 	public MessageProvider provider() {
 		return new GMMessageProvider();
 	}

	@Bean
 	public MessageRenderer renderer(){
 		ConMessageRenderer renderer = new ConMessageRenderer();
 		renderer.setMessageProvider(provider());
 		return renderer;
	 }
}