package org.bryanleekw.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangel = new Triangle(); 
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("config.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
