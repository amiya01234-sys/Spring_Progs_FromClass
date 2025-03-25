package com.mart.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mart.config.AppConfig;
import com.mart.sbeans.VoterDetails;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		VoterDetails details=ctx.getBean("vd",VoterDetails.class);
		
		String resultMsg=details.checkVotingElegibility();
		System.out.println(resultMsg);
	
	ctx.close();
	}

}
