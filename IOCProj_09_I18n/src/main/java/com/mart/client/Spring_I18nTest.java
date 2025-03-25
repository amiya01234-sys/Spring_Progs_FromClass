package com.mart.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mart.config.AppConfig;

public class Spring_I18nTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Language Code");
		String lang=sc.next();
		System.out.println("Enter  Country Code");
		String country=sc.next();
		
		Locale locale=new Locale(lang,country);
		
		String msg1=ctx.getMessage("welcome.msg",new Object[] {}, locale);

		String msg2=ctx.getMessage("goodbye.msg",new Object[] {}, locale);

		String msg3=ctx.getMessage("application.title",new Object[] {}, locale);

		System.out.println(msg1+""+msg2+""+msg3);
		ctx.close();
		
		
		
	}

}
