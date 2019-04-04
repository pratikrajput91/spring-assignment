package com.capgemini.spring.test;
import com.capgemini.spring.renderer.*;
import org.springframework.context.support.GenericXmlApplicationContext;
public class Test {
 	public static void main(String args[]) {
 
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
 	ctx.load("context.xml");
 	ctx.refresh();
 	MessageRenderer renderer = ctx.getBean(MessageRenderer.class);
 	renderer.render();
 	ctx.close();
  }
}