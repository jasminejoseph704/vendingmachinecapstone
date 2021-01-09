package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.techelevator.view.*;

public class Inventory {

	// Is this an: INSTANCE VARIABLE "Attribute" ?
	private List<Item> inventory = new ArrayList<Item>();

	// CONSTRUCTOR
	public Inventory(List<Item> inputList) {
		this.inventory = inputList;
	}


	// METHOD: getItem(slotId);
	public void getItem(String slotId) {
		System.out.println("Items available: ");
		for(item item : vendingMachine.getInventory().getItem()) {
		System.out.println(getProductName(item));
		}
		
	//METHOD: printAll()
	private String getProductName(Item item) {
		return item.getSlotId() + "" + item.getProductName() + "" + item.getPrice();
		}
	}



