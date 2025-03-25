
//target class
package sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg1")
public class Wmg {
	
	private LocalTime lt;
	private LocalDate ld;
	
	@Autowired
	public void assignTime(LocalTime time) {
		lt=time;
	}
	@Autowired
	public void putDate(LocalDate date) {
		ld=date;
	}
	
	
	
	
	//@Autowired
	//private LocalTime lt1;
	
	
	
	/*@Autowired
	public void setLt(LocalTime lt) {
		this.lt = lt;
	}



	@Autowired
	public void setLd(LocalDate ld) {
		Ld = ld;
	}*/



	/*@Autowired(required=false)
	public Wmg(LocalTime lt, LocalDate ld) {
		System.out.println("2param con");
		this.lt = lt;
		Ld = ld;
	}

	@Autowired(required=false)
	public Wmg(LocalTime lt) {
		System.out.println("1param con");
		 
		this.lt = lt;
		
	}*/




	public String generatem(String user) {
		int hour=lt.getHour();
		int m=ld.getMonthValue();
		//int l=lt1.getHour();
		//System.out.println(l);
		//System.out.println(m);
		if(hour<12 && m>3 ||m<6)
			return "Good MOrinig *****"+user+"***Its Summer Season";
		else
			return "good night"+user+"Its not Summer Season";
		
	}

}
