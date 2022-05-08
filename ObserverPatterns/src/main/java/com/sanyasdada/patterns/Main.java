package com.sanyasdada.patterns;

public class Main {

	public static void main(String[] args) {
      PaymentManager paymentManager = new PaymentManager();
      
      
      PaymentListener p1 = new NotificationManager();
      paymentManager.registerListener(p1);
     // paymentManager.registerListener(() -> System.out.println(:);
      PaymentListener p2 = new PaymentEventLogger();
      paymentManager.registerListener(p2);
      paymentManager.pay();
      
    
      paymentManager.unregisterPaymentListener(p2);
      
      paymentManager.pay();
	}

}
