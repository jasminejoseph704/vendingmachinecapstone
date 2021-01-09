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
}

// getItem(slotId);
/**
 * public boolean getItem(String slotId) {
 * 
 * boolean correct = inventory.getItem(slotId); if (correct) {
 * System.out.println("vendindmachine.csv"); } else { System.out.println("") }
 * // printAll()
 * 
 */
