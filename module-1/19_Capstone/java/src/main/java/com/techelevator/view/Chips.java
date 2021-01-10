package com.techelevator.view;

import java.math.BigDecimal;

public class Chips extends Item {

	
		public Chips(String slotId, String productName, BigDecimal price, String category) {
			super( slotId, productName, price, category);
			
		}

		public String messageSound() {
			
		return (super.getCategory() + " Crunch Crunch, Yum!");
	}

}
