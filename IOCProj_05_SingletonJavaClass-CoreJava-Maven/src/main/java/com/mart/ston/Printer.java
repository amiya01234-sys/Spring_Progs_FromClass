package com.mart.ston;

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
