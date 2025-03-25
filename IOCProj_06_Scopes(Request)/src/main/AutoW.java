package main;





import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mart.ston.Printer;

import config.AppConfig;
import sbeans.Wmg;

public class AutoW {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Printer prn1=ctx.getBean("prn",Printer.class);
		Printer prn2 =ctx.getBean("prn",Printer.class);
		System.out.println(prn1.getClass()+"----"+prn2.getClass());
		System.out.println(prn1==prn2);
		System.out.println(prn1.hashCode()+"---"+prn2.hashCode());
		
		
		
		
		
		
		
		
		
		
		
	
		ctx.close();
		
	}

}
