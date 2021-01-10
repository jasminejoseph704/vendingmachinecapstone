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

	// METHOD: GETITEM(SLOT ID)
	public void getItem(String slotId) {
		for (Item item : inventory) {
			if (slotId.equalsIgnoreCase(item.getSlotId())) {
				System.out.println("Items available: ");
			}
		}
	}

	// METHOD: PRINTALL() METHOD
	public void printAll() {
		System.out.println("Items available: ");
			for (Item item : inventory) {
				System.out.println(item);
		}
	}
}

//String getProductName(Item item) {
//return item.getSlotId() + "" + item.getProductName() + "" + item.getPrice();
