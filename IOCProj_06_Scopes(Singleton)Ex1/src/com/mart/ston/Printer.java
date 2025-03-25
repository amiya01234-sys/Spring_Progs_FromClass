package com.mart.ston;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//14th sept example using normal class
//modified for 16th sept example of what happens
//if we configure real singleton java class as the prototype
//scope spring bean?

@Component("prn")//from here 16sept next change in appconfig
@Scope("prototype")
public class Printer {
	
	private static Printer INSTANCE;//ref var to hold that single object
	
	private Printer() {
		System.out.println("printer :0-arg constructor");
		}
	
	//checks the instance if there is another object created give his address if not then create new one
	public static Printer getInstance() {
	if(INSTANCE==null)
		INSTANCE=new Printer();
	return INSTANCE;
	}
	
	public void print(String data) {
		System.out.println(data);
	}
	
}
