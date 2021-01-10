package com.techelevator.view;

import java.math.BigDecimal;

public class Drink extends Item {

	// CONSTRUCTOR
	public Drink(String slotId, String productName, BigDecimal price, String category) {
		super(slotId, productName, price, category);
	}

	// METHOD: MESSAGE SOUND
	public String messageSound() {
		return (super.getCategory() + " Glug Glug, Yum!");
	}
}
