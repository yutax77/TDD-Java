package com.yutax77;

public class Franc extends Money {
	Franc(int amount){
		this.amount = amount;
	}

	Money times(int multiplier) {
		return new Franc(amount * multiplier);
	}

	@Override
	String currency() {
		return "CHF";
	}
}
