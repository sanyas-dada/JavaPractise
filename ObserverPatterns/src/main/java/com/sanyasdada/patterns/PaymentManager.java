package com.sanyasdada.patterns;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager{

	private final List<PaymentListener> paymentListener = new ArrayList<>();

	public void pay() { // ===> notify some payment listeners
		PaymentEvent e = new PaymentEvent();
        paymentListener.forEach(p -> p.paymentMade(e)); // p => p.paymentMade()
	}

	public void registerListener(PaymentListener p) {
		paymentListener.add(p);
	}
	public void unregisterPaymentListener(PaymentListener p) {
		paymentListener.remove(p);
	}
}
