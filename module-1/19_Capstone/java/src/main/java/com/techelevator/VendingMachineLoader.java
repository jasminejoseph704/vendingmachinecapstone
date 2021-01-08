package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.techelevator.view.*;

public class VendingMachineLoader {

	// Instance Variable "Attributes"
	private File csvFile;

	// Constructor
	public VendingMachineLoader(File csvFile) {
		this.csvFile = csvFile;
	}

// NOTE this changed to protected here to facilitate testing!
	protected Item convertLineIntoItem(String line) {
		String[] components = line.split("\\|");

		if (components.length != 4) {
			return null;
		}
		String slotId = components[0].trim();
		String productName = components[1].trim();
		String price = components[2].trim();
		String category = components[3].trim();

		if (category.toLowerCase().equals("Candy")) {
			Candy candy = new Candy();
			candy.setSlotId(slotId);
			candy.setProductName(productName);
			candy.setPrice(new BigDecimal(price));
			return candy;
		} else if (category.toLowerCase().equals("Chips")) {
			Chips chips = new Chips();
			chips.setSlotId(slotId);
			chips.setProductName(productName);
			chips.setPrice(new BigDecimal(price));
			return chips;

		} else if (category.toLowerCase().equals("Beverage")) {
			Beverage beverage = new Beverage();
			beverage.setSlotId(slotId);
			beverage.setProductName(productName);
			beverage.setPrice(new BigDecimal(price));
			return beverage;
		} else if (category.toLowerCase().equals("Gum")) {
			Gum gum = new Gum();
			gum.setSlotId(slotId);
			gum.setProductName(productName);
			gum.setPrice(new BigDecimal(price));
			return gum;
		} else {
			return null;
		}

	}
	public Inventory loadInventory() {
		 List<Item> temp = new ArrayList<Item>();
		try(Scanner fileScanner = new Scanner(this.csvFile)){
			while(fileScanner.hasNextLine()) {
				String line =fileScanner.nextLine();
				Item i = convertLineIntoItem(line);
				if(i != null) {
					temp.add(i);
				}
			}
		} catch (FileNotFoundException e) {
			
		}
		
		
		
		
		return new Inventory(temp);
	}   
}