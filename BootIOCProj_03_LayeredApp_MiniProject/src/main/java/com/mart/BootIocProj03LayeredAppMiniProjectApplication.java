package com.mart;

import java.io.Closeable;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.mart.controller.EmployeeOperationsController;
import com.mart.model.Employee;

@SpringBootApplication
public class BootIocProj03LayeredAppMiniProjectApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootIocProj03LayeredAppMiniProjectApplication.class, args);
	
	EmployeeOperationsController controller=ctx.getBean("empController",EmployeeOperationsController.class);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter desg1");
	String desg1=sc.next();
	System.out.println("enter desg2");
	String desg2=sc.next();
	System.out.println("enter desg3");
	String desg3=sc.next();
	
	try {
		List<Employee> list=controller.processEmployeesByDesgs(desg1, desg2, desg3);
		list.forEach(emp->{
			System.out.println(emp);
		});
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("Internal Problem try again");
	}
	
	((ConfigurableApplicationContext) ctx).close();
	}

}
