package com.techelevator;

import java.math.BigDecimal;

import java.util.Scanner;
import com.techelevator.view.*;

public class Transaction {

	public Transaction() {

	}

	private static BigDecimal balance = new BigDecimal(0);

	static Item item = new Item(null, null, balance, null);

	private static BigDecimal newBalance = new BigDecimal(0);
	
	static Log log = new Log();

	public BigDecimal getNewBalance() {
		return newBalance;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void feedMoney() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Please input money in dollar amount of $1, $2, $5, or $10: ");
			String moneyInputAsString = scanner.nextLine();
			// Integer moneyInput = Integer.parseInt(moneyInputAsString);
			BigDecimal moneyInput = new BigDecimal(moneyInputAsString);

			BigDecimal bg1 = new BigDecimal("1");
			BigDecimal bg2 = new BigDecimal("2");
			BigDecimal bg3 = new BigDecimal("5");
			BigDecimal bg4 = new BigDecimal("10");

			if (moneyInput.equals(bg1) | moneyInput.equals(bg2) | moneyInput.equals(bg3) | moneyInput.equals(bg4)) {
				System.out.println("\n");

				balance = balance.add(moneyInput);
				 log.logFeed(moneyInput, balance);
			} else
				// (moneyInput != 1 || moneyInput == 2 || moneyInput == 5 || moneyInput == 10)
				System.out.println(" ");
		} catch (NumberFormatException e) {
			System.out.println("You may only input money in dollar amounts of $1, $2, $5,or $10: ");
		}
	}

	public static boolean purchase(BigDecimal price) {
		if (balance.subtract(price).signum() >= 0) {
			balance = balance.subtract(price);
			log.logPurchase( "PURCHASE ", item, balance);
			return true;
		} else {
			return false;
		}
	}

	public void giveChange() {
		String returnChange = "Change due: ";
		if (balance.signum() > 0) {
			int[] coinsArray = new int[4];
			int tempBalance = (int) (balance.doubleValue() * 100);
			String[] coins = { "Quarters", "Dimes", "Nickels", "Pennies" };
			int[] coinValue = { 25, 10, 5, 1 };
			for (int i = 0; i < 4; i++) {
				if (tempBalance > 0) {
					coinsArray[i] = (int) (tempBalance / coinValue[i]);
					tempBalance -= coinsArray[i] * coinValue[i];
					returnChange += coinsArray[i] + " " + coins[i] + " ";
				}
			}
			System.out.println(returnChange);
		} else {
			System.out.println("No change due");
		}
		// log change given method
		log.logChange(returnChange, getBalance());
		balance = BigDecimal.valueOf(0.00);
	}

}


