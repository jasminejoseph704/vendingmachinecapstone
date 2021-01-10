package com.techelevator.view;

import java.math.BigDecimal;

public class Drink extends Item {
	
	public Drink(String slotId, String productName, BigDecimal price, String category) {
		super( slotId, productName, price, category);
		
	}

	public String messageSound() {

		return (super.getCategory() + " Glug Glug, Yum!");
	}

}
