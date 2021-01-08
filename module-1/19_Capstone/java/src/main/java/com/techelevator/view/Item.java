package com.techelevator.view;

import java.math.BigDecimal;

public class Item {

	//Instance Variables "Attributes"
	private String slotId;
	private String productName;
	private BigDecimal price;
	private String category;

	//Constructors
	public void item(String slotId, String productName, BigDecimal price) {
		this.slotId = slotId;
		this.productName = productName;
		this.price = price;
	}
	//Setters
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

	public void item(String category) {
		this.category = category;
	}

	
	//Getters
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

 