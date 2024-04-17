package com.example.demo8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo8Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo8Application.class, args);

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		//Emp emp1= context.getBean("emp1",Emp.class);
		Emp emp2= context.getBean("emp2",Emp.class);
		//System.out.println(emp1);
		System.out.println(emp2);

	}

}
