package mainclass;

import components.Flipkart;
import factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		//get flipkaet obj
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		//invoke the b.meth
		String resultMsg=fpkt.shopping(new String[] {"Dress","Bike","Chain"},new double[] {5000.0,120000.0,2450.0});
		System.out.println(resultMsg);
		
		
	}

}
