package com.sanyasdada.patterns;

public class PaymentEventLogger implements PaymentListener {
	private void logEvent() {
		System.out.println("Payment received");
	}

	@Override
	public void paymentMade(PaymentEvent e) {
      logEvent();		
	}
}
