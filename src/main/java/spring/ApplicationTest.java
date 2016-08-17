package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import beans.Test;

public class ApplicationTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ap = new FileSystemXmlApplicationContext("classpath:beans.xml");
		//ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
		Test test = (Test) ap.getBean("test");
		test.hello();
		
	}

}
