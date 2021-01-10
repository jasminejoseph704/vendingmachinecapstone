package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.techelevator.view.*;

public class VendingMachineLoader {

	// INSTANCE VARIABLE "Attribute"
  private File inputFile;
	// private File csvFile;

	// CONSTRUCTOR
	
	public VendingMachineLoader(File inputFile ) {
		this.inputFile = inputFile;
		
		// this.csvFile = csvFile;
	}

	// NOTE this changed to 'PROTECTED' here to facilitate testing!
	protected Item convertLineIntoItem(String line) {
		String[] components = line.split("\\|");
		if (components.length != 4) {
			return null;
		}

		String slotId = components[0].trim();
		String productName = components[1].trim();
		BigDecimal price = new BigDecimal(components[2].trim());
		String category = components[3].trim();

		if (category.toLowerCase().equals("candy")) {
			
			return new Candy(slotId, productName, price, category);

		} else if (category.toLowerCase().equals("chip")) {
			
			return  new Chips(slotId, productName, price, category);

		} else if (category.toLowerCase().equals("drink")) {
			return  new Drink(slotId, productName, price, category);

		} else if (category.toLowerCase().equals("gum")) {
			return  new Gum(slotId, productName, price, category);

		} else {
			return null;
		}
	}

	public Inventory loadInventory() {
		List<Item> temp = new ArrayList<Item>();
		try (Scanner fileScanner = new Scanner(this.inputFile)) {
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				Item i = convertLineIntoItem(line);
				if (i != null) {
					temp.add(i);
				}
				
			}
		} catch (FileNotFoundException e) {

		}
		return new Inventory(temp);
	}
}