package com.yutax77;

class Money {
	protected int amount;
	protected String currency;
		
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	Money times(int multiplier) {
		return null;
	}
	
	String currency() {
		return currency;
	}
	
	@Override
	public String toString() {
		return amount + " " + currency;
	}
	
	@Override
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency());
	}

	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
}
