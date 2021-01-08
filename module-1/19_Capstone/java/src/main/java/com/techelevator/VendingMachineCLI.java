package com.techelevator;

import java.io.File;
import java.util.Map;

import com.techelevator.pokemon.Pokemon;
import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };

	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	
//	private static File validateCsvPath(String pathToCSV) {
//		File csvFile = new File(pathToCSV);
//		if (!csvFile.exists()) {
//			System.out.println("You must enter an existing pokedex file");
//			csvFile = null;
//		} else if (!csvFile.isFile()) {
//			System.out.println("You must enter a file, not a directory");
//			csvFile = null;
//		} else if (!csvFile.canRead()) {
//			System.out.println("You must give us a pokedex file we can read");
//			csvFile = null;
//		}

//		return csvFile;
//	}
//CsvLoader loader = new CsvLoader(pokeDexFile);
//	Map<Integer,Pokemon> realPokedex = loader.loadPokedex();
	
	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
			}
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
