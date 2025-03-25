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
		
		
		
		
		
		
		
		
		
		
		
		//commented for 16thsept example
		/*Printer prn1=ctx.getBean("prn1",Printer.class);
		Printer prn2 =ctx.getBean("prn1",Printer.class);
		System.out.println(prn1.getClass()+"----"+prn2.getClass());
		System.out.println(prn1==prn2);
		System.out.println(prn1.hashCode()+"---"+prn2.hashCode());
		
		//14th sept ex from now
		*/		
		/*Printer prn11=ctx.getBean("prn2",Printer.class);
		Printer prn22 =ctx.getBean("prn2",Printer.class);
		System.out.println(prn11.getClass()+"----"+prn22.getClass());
		System.out.println(prn1==prn2);
		System.out.println(prn11.hashCode()+"---"+prn22.hashCode());
		//OUTPUT= SAME HASCODE OF 4 OBJECTS prn1,2,11,22...
		
		*/
		ctx.close();
		
	}

}
