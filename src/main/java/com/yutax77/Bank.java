package com.yutax77;

import java.util.HashMap;
import java.util.Map;

class Bank {
	private Map<Pair, Integer> rates = new HashMap<Pair, Integer>();
	
	Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}

	int rate(String from, String to) {
		if(from.equals(to)) return 1;
		return rates.get(new Pair(from, to));
	}
	
	void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), new Integer(rate));
	}
	
	private class Pair {
		private String from;
		private String to;
		
		Pair(String from, String to) {
			this.from = from;
			this.to = to;
		}
		
		@Override
		public boolean equals(Object object) {
			Pair pair = (Pair) object;
			return from.equals(pair.from) && to.equals(pair.to);
		}
		
		@Override
		public int hashCode() {
			return 0;
		}
	}
}
