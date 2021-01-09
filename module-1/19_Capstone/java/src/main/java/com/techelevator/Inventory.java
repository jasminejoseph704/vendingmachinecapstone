package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.techelevator.view.*;

public class Inventory {
	private List<Item> inventory = new ArrayList<Item>();

	public Inventory(List<Item> inputList) {
		this.inventory = inputList;
	}

	// getItem(slotId);
	public boolean getItem(String slotId) {
		boolean correct = ((Inventory) inventory).getItem(slotId);
		for(Item item : category.getItem()) {
			if(item.getSlotId().contentEquals(slotId)) {
				if(total >= item.getPrice()) {
					total -= item.getPrice();
					return true;
				} else {
					return false;
				}
			}
		}
			return false;
		// printAll()
	}
}
