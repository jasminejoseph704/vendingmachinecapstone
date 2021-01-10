package com.techelevator;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };

	// INSTANCE VARIABLES "Attributes"
	private Menu menu;

	private Scanner userInput = new Scanner(System.in);

	private File file = new File("vendingmachine.csv");
	private VendingMachineLoader loader = new VendingMachineLoader(file);
	private Inventory inventory = loader.loadInventory();

	// CONSTRUCTOR
	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
		// this.inventory = inventory;
	}

	// RUN METHOD
	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
				inventory.printAll();
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
			}
		}
	}

	// RUN INVENTORY FILE: METHOD
	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);

		// VendingMachineLoader loader = new VendingMachineLoader(file);

		// Inventory i = VendingMachineloader.loadInventory();
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
