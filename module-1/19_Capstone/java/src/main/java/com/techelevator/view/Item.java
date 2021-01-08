package com.techelevator.view;
import java.math.BigDecimal;

 
 public class Item  {

	
	private  String slotId;
	private  String productName;
	private  BigDecimal price;
	private  String category;

	
	
	
	public void item(String slotId, String productName, BigDecimal price) {
		this.slotId = slotId;
		this.productName = productName;
		this.price = price;
		
		
	}
	
	public void item(String category) {
		this.category = category;
		
	}

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

 