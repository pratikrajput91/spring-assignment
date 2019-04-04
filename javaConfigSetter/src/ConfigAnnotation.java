
package com.capgemini.spring.configannotation; 
import com.capgemini.spring.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.renderer.*;
import com.capgemini.spring.provider.*;

public class ConfigAnnotation{
public static void main(String... args) {
 ApplicationContext ctx = new AnnotationConfigApplicationContext
 (ConfigurationDemo.class);
 MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
 renderer.render();
 }
}
