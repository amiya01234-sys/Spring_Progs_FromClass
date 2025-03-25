package factory;

import sbeans.BlueDart;
import sbeans.DTDC;
import sbeans.Flipkart;
import sbeans.ICourier;

public class FlipkartFactory {
	public static Flipkart getInstance(String courierType) {
		ICourier courier=null;
		 
		
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("bDart"))
			courier=new BlueDart();
		else 
			throw new IllegalArgumentException("Invalid");
		
		
		Flipkart fpkt=new Flipkart();
		fpkt.setCourier(courier);
		return fpkt;
		
		
	}
	
	
	
	
	
}
