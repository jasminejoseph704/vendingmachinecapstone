package com.techelevator;

import java.math.BigDecimal;

import java.util.Scanner;
import com.techelevator.view.*;

public class Transaction {

	

	public Transaction() {

	}
	private BigDecimal balance = new BigDecimal(0) ;
	private BigDecimal moneyInput = new BigDecimal(0);
	public BigDecimal getMoneyInput() {
		return moneyInput;
	}
	public BigDecimal getBalance() {
		return balance;
	}

	public void feedMoney() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Please input money in dollar amount of $1, $2, $5, or $10: ");
			String moneyInputAsString = scanner.nextLine();
			//Integer moneyInput = Integer.parseInt(moneyInputAsString);
			BigDecimal moneyInput =  new BigDecimal(moneyInputAsString);
					
			BigDecimal bg1 = new BigDecimal("1");
			BigDecimal bg2 = new BigDecimal("2");
			BigDecimal bg3 = new BigDecimal("5");
			BigDecimal bg4 = new BigDecimal("10");
			
			if (moneyInput.equals(bg1) | moneyInput.equals(bg2) | moneyInput.equals(bg3) | moneyInput.equals(bg4)){
				System.out.println("\n");
				
				balance = balance.add(moneyInput);
								
			} else 
			//(moneyInput != 1 || moneyInput == 2 || moneyInput == 5 || moneyInput == 10)
				System.out.println(" ");
		} catch (NumberFormatException e) {
			System.out.println("You may only input money in dollar amounts of $1, $2, $5,or $10: ");
		}
	}
 
}

/**
 * 
 *   category.getItem()) { if (item.getslotID().equals(slotID)) { if (balance >=
		 item.getPrice()) { balance -= item.getPrice(); return true; } else { return
		  false; } } } return false; }
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
