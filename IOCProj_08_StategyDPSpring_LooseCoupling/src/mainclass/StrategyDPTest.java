package mainclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		
		
		String resultMsg=fpkt.shopping(new String[] {"Dress","Bike","Chain"},new double[] {5000.0,120000.0,2450.0});
		System.out.println(resultMsg);
		
		ctx.close();
	}

}
