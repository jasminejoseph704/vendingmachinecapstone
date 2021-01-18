package com.techelevator;

public class SAVE {
	
	
	
	/****
	 * package com.techelevator;

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
					if (choice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
                        //read input amount
						
					} else if (choice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
                        // call slotId
					} else if (choice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
						//receive change
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

		VendingMachineCLI cli = new VendingMachineCLI(menu,purchaseMenu);
		cli.run();
	}
}



//////////////////////////////////////////////////TRANSACTION///////////////////////////////
 * 
 * 
 * package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;
import com.techelevator.view.*;

public class Transaction extends Item {

	public Transaction(String slotId, String productName, BigDecimal price, String category) {
		super(slotId, productName, price, category);
		
	}

     public void feedMoney() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Please input money in dollar amount of $1, $2, $5, or $10: ");
    	String moneyInputAsString = scanner.nextLine();
    	System.out.println( "CurrentMoneyProvided: " + moneyInputAsString);
}
     /**
      * 
      * MAYBE THIS CODE WILL SUFFICE, IT HAS THREE PARTS
      * SET A MAX AMOUNT
      * FEED MACHINE
      * GET ITEM
      * 
 	//
	public class Transaction {
	
	//INSTANCE VARIABLES "Attributes"
    private static final double”BigDecimal” MAX_ALLOWED_BALANCE = 400.00;
    private final Item category;
    private BigDecimal balance = 0.00;

	//METHOD: SET MAX AMOUNT TO FEED IN MACHINE
    public Transaction(Item category) {
        if (category == null || category.getItem() == null || category.getItem().isEmpty()) {
            throw new IllegalArgumentException("Item list is null or empty");
        }
        for (SlotId item : category.getItem()) {
            if (item.getPrice() > MAX_ALLOWED_BALANCE) {
                throw new IllegalArgumentException("Price of a product exceeds " + MAX_ALLOWED_BALANCE);
            }
        }
        this.category = category;
    }
    public Item getItem() {
        return category;
    }
}

	//CONSTRUCTOR: GET BALANCE
	public double getBalance() {
    	return balance;
}

	//METHOD: FEED MONEY
	public void addMoney(double amountToAdd) {
    	// only add the money to the balance if it doesn't exceed the allowed maximum
    	if (balance + amountToAdd <= MAX_ALLOWED_BALANCE) {
        	balance += amountToAdd;
    }
}
	//METHOD: GET CHANGE
	public double giveChange() {
    	double changeToGive = balance;
    	balance = 0;
    		return changeToGive;
}


	//METHOD: DELIVER ITEM
	public boolean getItem(String slotID) {
    	// Go through all items until finding the chosen one,
    	// then deduct the cost and return true only if there
    	// is enough balance.
    	for (ProductDetail item : category.getItem()) {
        	if (item.getslotID().equals(slotID)) {
            	if (balance >= item.getPrice()) {
                	balance -= item.getPrice();
                	return true;
            	} else {
                	return false;
            }
        }
    }
    return false;
}

      
      /////////////////////////////////////////////INVENTORY////////////////////////////
        
        
       
     
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

      *
      *
      *
      //////////////////////////////VENDING MACHINE LOADER//////////////////////////////////////
        
       
   
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

	// CONSTRUCTOR
	public VendingMachineLoader(File inputFile) {
		this.inputFile = inputFile;
	}

	// NOTE this changed to 'PROTECTED' here to facilitate testing!
	//DISPLAY SLOTID | PRODUCTNAME | PRICE | CATEGORY: METHOD
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

			return new Chips(slotId, productName, price, category);

		} else if (category.toLowerCase().equals("drink")) {
			return new Drink(slotId, productName, price, category);

		} else if (category.toLowerCase().equals("gum")) {
			return new Gum(slotId, productName, price, category);

		} else {
			return null;
		}
	}
	
	//JASMINE, WHAT DOES THIS METHOD DO FOR US: READS THE CSV FILE
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
      */
}
/***
 * METHOD: DELIVER ITEM public boolean getItem(String slotID) { // Go through
 * all items until finding the chosen one, then deduct the cost and return true
 * only if there // is enough balance. for (ProductDetail item :
 * category.getItem()) { if (item.getslotID().equals(slotID)) { if (balance >=
 * item.getPrice()) { balance -= item.getPrice(); return true; } else { return
 * false; } } } return false; }
 * //if(item.getPrice().compareTo(balance.getBalance())==1); // BigDecimal
 * newBalance = balance; /**
 * 
 * category.getItem()) { if (item.getslotID().equals(slotID)) { if (balance >=
 * item.getPrice()) { balance -= item.getPrice(); return true; } else { return
 * false; } } } return false; }
 * 
 * 
 * MAYBE THIS CODE WILL SUFFICE, IT HAS THREE PARTS SET A MAX AMOUNT FEED
 * MACHINE GET ITEM
 * 
 * // public class Transaction {
 * 
 * //INSTANCE VARIABLES "Attributes" private static final double”BigDecimal”
 * MAX_ALLOWED_BALANCE = 400.00; private final Item category; private BigDecimal
 * balance = 0.00;
 * 
 * //METHOD: SET MAX AMOUNT TO FEED IN MACHINE public Transaction(Item category)
 * { if (category == null || category.getItem() == null ||
 * category.getItem().isEmpty()) { throw new IllegalArgumentException("Item list
 * is null or empty"); } for (SlotId item : category.getItem()) { if
 * (item.getPrice() > MAX_ALLOWED_BALANCE) { throw new
 * IllegalArgumentException("Price of a product exceeds " +
 * MAX_ALLOWED_BALANCE); } } this.category = category; } public Item getItem() {
 * return category; } }
 * 
 * //CONSTRUCTOR: GET BALANCE public double getBalance() { return balance; }
 * 
 * //METHOD: FEED MONEY public void addMoney(double amountToAdd) { // only add
 * the money to the balance if it doesn't exceed the allowed maximum if (balance
 * + amountToAdd <= MAX_ALLOWED_BALANCE) { balance += amountToAdd; } } //METHOD:
 * GET CHANGE public double giveChange() { double changeToGive = balance;
 * balance = 0; return changeToGive; }
 * 
 * 
 * METHOD: DELIVER ITEM public boolean getItem(String slotID) { // Go through
 * all items until finding the chosen one, // then deduct the cost and return
 * true only if there // is enough balance. for (ProductDetail item :
 * category.getItem()) { if (item.getslotID().equals(slotID)) { if (balance >=
 * item.getPrice()) { balance -= item.getPrice(); return true; } else { return
 * false; } } } return false; }
 *
 *
 *
 * 
 */
