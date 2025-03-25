package main;


import java.time.LocalTime;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import sbeans.Wmg;

public class AutoW {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Wmg generator1=ctx.getBean("wmg1", Wmg.class);
		
		Wmg generator2=ctx.getBean("wmg1", Wmg.class);
		
		System.out.println(generator1.hashCode()+"***"+generator2.hashCode());
		System.out.println(generator1==generator2);
		
		/*
		//HashCode will be same because IOC keeps the object
		//In the internal Cache and Resued it By default it is SingleTon
		//System.out.println("-----");
		LocalTime lt=ctx.getBean("ltime",LocalTime.class);
		LocalTime lt2=ctx.getBean("ltime",LocalTime.class);
		
		System.out.println(lt.hashCode()+"----"+lt2.hashCode());
		
		System.out.println("all bean ids count ::"+ctx.getBeanDefinitionCount());
		System.out.println("all bean ids::"+Arrays.toString(ctx.getBeanDefinitionNames()));*/
		ctx.close();
		
	}

}
