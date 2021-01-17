package com.techelevator.view;

import java.math.BigDecimal;

public class Candy extends Item {

	// CONSTRUCTOR
	public Candy(String slotId, String productName, BigDecimal price, String category) {
		super(slotId, productName, price, category);
	}

	// METHOD: MESSAGE SOUND
	public void messageSound() {
		System.out.println( "Munch Munch, Yum!");
	}
}
//public String messageSound() {
	//return (super.getCategory() + " Munch Munch, Yum!");