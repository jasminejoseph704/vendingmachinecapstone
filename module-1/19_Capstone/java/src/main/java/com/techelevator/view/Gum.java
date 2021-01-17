package com.techelevator.view;

import java.math.BigDecimal;

public class Gum extends Item {

	// CONSTRUCTOR
	public Gum(String slotId, String productName, BigDecimal price, String category) {
		super(slotId, productName, price, category);
	}

	// METHOD: MESSAGE SOUND
	public void messageSound() {
		System.out.println ("Chew Chew, Yum!");
	}
}
