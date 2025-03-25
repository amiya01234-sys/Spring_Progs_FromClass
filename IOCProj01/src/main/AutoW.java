package main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import sbeans.Wmg;

public class AutoW {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Wmg gen=ctx.getBean("wmg1", Wmg.class);
		String msg=gen.generatem("AR");
		System.out.println(msg);
		ctx.close();
		
	}

}
