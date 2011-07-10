package com.yutax77;

public class Franc {
	private int amount; 
	
	Franc(int amount){
		this.amount = amount;
	}

	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	@Override
	public boolean equals(Object object) {
		Franc franc = (Franc) object;
		return amount == franc.amount;
	}
}
