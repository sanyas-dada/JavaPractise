package com.sanyasdada.patterns;

public class PaymentEvent {
	
	// any detail you want here.
	private final PaymentSubject paymentSubject;

	public PaymentEvent(PaymentSubject paymentSubject) {
	
		this.paymentSubject = paymentSubject;
	}

	public PaymentSubject getPaymentSubject() {
		return paymentSubject;
	}
	
	

}
