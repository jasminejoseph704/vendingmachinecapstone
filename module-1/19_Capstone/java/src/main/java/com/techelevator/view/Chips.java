package com.techelevator.view;

import java.math.BigDecimal;

public class Chips extends Item {

	// CONSTRUCTOR
	public Chips(String slotId, String productName, BigDecimal price, String category) {
		super(slotId, productName, price, category);
	}

	// METHOD: MESSAGE SOUND
	public String messageSound() {
		return (super.getCategory() + " Crunch Crunch, Yum!");
	}
}
