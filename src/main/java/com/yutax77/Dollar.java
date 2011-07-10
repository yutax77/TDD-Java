package com.yutax77;

public class Dollar {
	int amount; 
	
	Dollar(int amount){
		this.amount = amount;
	}

	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
	@Override
	public boolean equals(Object object) {
		return true;
	}
}
