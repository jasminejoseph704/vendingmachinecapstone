package com.techelevator.view;

import java.math.BigDecimal;

public class Candy extends Item {

		
		public Candy(String slotId, String productName, BigDecimal price, String category) {
			super( slotId, productName, price, category);
			
		}

			public String messageSound() {
		return (super.getCategory() + " Munch Munch, Yum!");
	}
			

}


