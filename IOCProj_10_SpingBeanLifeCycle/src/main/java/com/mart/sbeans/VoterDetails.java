package com.mart.sbeans;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("vd")
@PropertySource("com/mart/commons/PersonInfo.properties")
public class VoterDetails {
	private static final long OL = 0;
	@Value("${voter.ano}")
	private long vid;
	@Value("${voter.name}")
	private String name; 
	@Value("${voter.age}")
	private float age;
	
	private Date dov;
	
	public VoterDetails() {
		System.out.println("VoterDetails.VoterDetails()");
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("VoterDetals.myinit()");
		dov=new Date(0, 0, 0);
		if(name==null||age<18||age>120||vid<0)
			throw new IllegalArgumentException("invallid input");
	}
	
	public String checkVotingElegibility() {
		System.out.println("VoterDetails.checkVotingElegibility()");
		if(age<18)
			return "Mr "+name+" you are not elegible for voting "+dov;
		else return "Mr "+name+" you are  elegible for voting "+dov;
		
	
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("VoterDetails.destroy()");
		dov=null;
		vid=0L;
		age=0;
		
		
		
	}
	
	
}
