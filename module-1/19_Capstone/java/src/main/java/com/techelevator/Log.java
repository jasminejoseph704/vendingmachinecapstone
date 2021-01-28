package com.techelevator;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.techelevator.view.Item;


public class Log {
	 private final File outputFile = new File("Log.txt");

	    public void logPurchase(String slotId, Item item, BigDecimal Balance) {
	        String event = item.getProductName() + " " + item.getSlotId();
	        String entry = buildLogEntryString(event, Balance, Balance);

	        printToFile(entry);
	    }

	    public void logFeed(BigDecimal moneyInput, BigDecimal Balance) {
	        String event = "FEED MONEY";
	        String entry = buildLogEntryString(event, moneyInput, Balance);

	        printToFile(entry);
	    }

	    public void logChange(String returnChange, BigDecimal Balance) {
	        String event = "GIVE CHANGE";
	        String entry = buildLogEntryString(event, Balance, Balance);

	        printToFile(entry);
	    }

	    private String buildLogEntryString(String event, BigDecimal balance, BigDecimal Balance) {
	        String date = (new SimpleDateFormat("MM/dd/YYYY hh:mm:ss a").format(new Date()));
	        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
	       	String endingBalanceString = (numberFormat.format(Balance.doubleValue()));
         
	        return String.format("%-25s%-25s%-10s%-10s", date, event, Balance, endingBalanceString);
	    }


	    private void printToFile(String entry) {
	        try (FileOutputStream f = new FileOutputStream(outputFile, true);
	             PrintWriter pw = new PrintWriter(f)) {

	            pw.println(entry);
	            pw.flush();
	        } catch (IOException e) {
	            System.out.println(e.toString());
	            System.out.println("Could not find file");
	        }
	    }
	}
	
	
	


