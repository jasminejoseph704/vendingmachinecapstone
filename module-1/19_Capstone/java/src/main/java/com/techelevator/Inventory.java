package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.techelevator.view.*;

public class Inventory {

	// Is this an: INSTANCE VARIABLE "Attribute" ?
	private List<Item> inventory = new ArrayList<Item>();

	Transaction balance = new Transaction();
	Candy candy = new Candy(null, null, null, null);
	Chips chips = new Chips(null, null, null, null);
	Drink drink = new Drink(null, null, null, null);
	Gum gum = new Gum(null, null, null, null);
	{
	}
	Item item = new Item(null, null, null, null);
	{
	}

	// CONSTRUCTOR
	public Inventory(List<Item> inputList) {
		this.inventory = inputList;
	}

	// METHOD: GETITEM(SLOT ID)

	public void getItem(String slotId) {

		Scanner itemScanner = new Scanner(System.in);
		System.out.print("Please input a slot id: ");
		String slotIdString = itemScanner.nextLine();

		for (Item item : inventory) {
			if (slotIdString.equalsIgnoreCase(item.getSlotId())) {

				System.out.println("The item you have selected is " + item.getSlotId() + " | " + item.getProductName()
						+ "| " + item.getPrice() + "| " + "Qty: " + item.getQuantity());
				if (item.getCategory().equalsIgnoreCase("Candy")) {
			    candy.messageSound();
			} else if (item.getCategory().equalsIgnoreCase("Chips")) {
				chips.messageSound();
			} else if (item.getCategory().equalsIgnoreCase("Drink")){
				drink.messageSound();
			}
			else gum.messageSound();
		}
	}
	}

	// public void getItem(String slotId) {
	// for (Item item : inventory) {
	// if (slotId.equalsIgnoreCase(item.getSlotId())) {
	// System.out.println("Items available: ");

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
