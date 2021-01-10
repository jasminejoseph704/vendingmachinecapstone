package com.techelevator.view;

import java.math.BigDecimal;

public class Gum extends Item {
	
	public Gum(String slotId, String productName, BigDecimal price, String category) {
		super( slotId, productName, price, category);
		
	}

	public String messageSound() {

		return (super.getCategory() + " Chew Chew, Yum!");
	}

}


