package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.spring.renderer.*;

public class Test1{

public static void main(String args[]) {


	ApplicationContext context = new ClassPathXmlApplicationContext("context1.xml");
	ConMessageRenderer renderer = (ConMessageRenderer)context.getBean("renderer");
	renderer.render();
}
}
	