package com.techelevator;
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
     
 	
}
