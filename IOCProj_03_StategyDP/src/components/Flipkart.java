package components;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	//HAS A property
	private ICourier courier;
	//Setter meth for assignment
	public void setCourier(ICourier courier) {
		this.courier=courier;
	}
	
	public String shopping(String items[],double prices[]) {
		//calculate the bill amount
		double totalAmt=0.0;
		for(double p:prices) {
			totalAmt=totalAmt+p;
		}
		//generate random number as the  order id
		int oid=new Random().nextInt(3000);
		
		//use dependent
		String dMsg=courier.deliver(oid);
		
		return Arrays.toString(items)+"are purrchased having pricess"+Arrays.toString(prices)+"bill amt"+totalAmt+"..."+dMsg;
	}
}
