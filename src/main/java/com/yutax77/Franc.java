package com.yutax77;

public class Franc extends Money {
	Franc(int amount, String currency){
		this.amount = amount;
		this.currency = "CHF";
	}

	Money times(int multiplier) {
		return new Franc(amount * multiplier, null);
	}
}
