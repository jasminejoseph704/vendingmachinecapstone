package com.techelevator.view;

import java.math.BigDecimal;

public class Item {

	// INSTANCE VARIABLES "Attributes"
	private String slotId;
	private String productName;
	private BigDecimal price;
	private String category;

	// CONSTRUCTORS
	public Item(String slotId, String productName, BigDecimal price, String category) {
		this.slotId = slotId;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}
	public String toString() {
		return (getSlotId() + " |" + getProductName() + " |" + getPrice() );
				
	}
	
	// SETTERS
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	// GETTERS
	public String getSlotId() {
		return slotId;
	}

	public String getProductName() {
		return productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

}
 