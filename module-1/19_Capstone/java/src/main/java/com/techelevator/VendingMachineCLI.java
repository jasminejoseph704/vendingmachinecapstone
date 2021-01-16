package com.techelevator;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

import com.techelevator.view.Menu;
import com.techelevator.view.PurchaseMenu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE,
			MAIN_MENU_OPTION_EXIT };

	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";
	private static final String[] PURCHASE_MENU_OPTIONS = { PURCHASE_MENU_OPTION_FEED_MONEY,
			PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION };
	

	// INSTANCE VARIABLES "Attributes"
    Transaction balance = new Transaction();
    
	private Menu menu;
	private PurchaseMenu purchaseMenu;

	private Scanner userInput = new Scanner(System.in);

	private File file = new File("vendingmachine.csv");
	private VendingMachineLoader loader = new VendingMachineLoader(file);
	private Inventory inventory = loader.loadInventory();
	
    
	// CONSTRUCTOR
	public VendingMachineCLI(Menu menu, PurchaseMenu purchaseMenu) {
		this.menu = menu;
		this.purchaseMenu = purchaseMenu;
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
				while (true) {
					String purchaseChoice = (String) purchaseMenu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
					if (purchaseChoice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
						// read input amountS
                        balance.feedMoney();
                        System.out.println( "Current Money Provided: " + balance.getBalance() + ".00");
					} else if (purchaseChoice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
						inventory.printAll();
						System.out.print("\n");
						inventory.getItem(purchaseChoice);
						// call slotId
					} else if (purchaseChoice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
						// receive change
					}
				}
			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				System.exit(0);
			}
		}
	}

	// RUN INVENTORY FILE: METHOD
	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		PurchaseMenu purchaseMenu = new PurchaseMenu(System.in, System.out);

		VendingMachineCLI cli = new VendingMachineCLI(menu, purchaseMenu);
		cli.run();
	}
}
