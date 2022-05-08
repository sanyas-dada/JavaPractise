package sanyasdada.com;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
     SupplierDemo demo  = new SupplierDemo();
     System.out.println(demo.fetchCurrentDate());
     
     
     Supplier<Date> currentDate = () -> new Date();
     System.out.println("using the suppllier method:"+currentDate.get());
  

	  
	}

	private Date fetchCurrentDate() {
		// TODO Auto-generated method stub
		return new Date();
	}

}
