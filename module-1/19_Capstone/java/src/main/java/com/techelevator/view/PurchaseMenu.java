package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;


public class PurchaseMenu {
	
	 //INSTANCE VARIABLES "Attributes"
		private PrintWriter out;
		private Scanner in;
		


		// CONSTRUCTOR
		public PurchaseMenu(InputStream input, OutputStream output) {
			this.out = new PrintWriter(output);
			this.in = new Scanner(input);
		}

		// METHOD: USER SELECTION
		public Object getChoiceFromOptions(Object[] options) {
			Object choice = null;
			while (choice == null) {
				displayPurchaseMenuOptions(options);
				choice = getChoiceFromUserInput(options);
			}
			return choice;
		}

		// METHOD: TRY / CATCH DISPLAY MENU
		private Object getChoiceFromUserInput(Object[] options) {
			Object choice = null;
			String userInput = in.nextLine();
			try {
				int selectedOption = Integer.valueOf(userInput);
				if (selectedOption > 0 && selectedOption <= options.length) {
					choice = options[selectedOption - 1];
				}
			} catch (NumberFormatException e) {
				// eat the exception, an error message will be displayed below since choice will
				// be null
			}
			if (choice == null) {
				out.println("\n*** " + userInput + " is not a valid option ***\n");
			}
			return choice;
		}

		// METHOD: FLUSH TO SAVE WORK
		private void displayPurchaseMenuOptions(Object[] options) {
			out.println();
			for (int i = 0; i < options.length; i++) {
				int optionNum = i + 1;
				out.println(optionNum + ") " + options[i]);
			}
			out.print("\nPlease choose an option >>> ");
			out.flush();

		}
	}

	
	
	
	
	
	
	
	
	
	
	/*
	// METHOD
	public BigDecimal getTotal() {
		if (quantity > 0 && quantity < 5) {
			return (super.getPrice().multiply(new BigDecimal(this.getQuantity()));
		} else {
			return BigDecimal.ZERO;
		}
	}

	@Override
	public String toString() {
		return "Slot ID: " + this.getSlotId() + " Product Name: " + this.getProductName() + " Price: $"
				+ this.getPrice() + " Qty: " + getQuantity() + " Total: $" + this.getTotal();
	}
	*/

