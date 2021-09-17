package com.techelevator;
import java.util.Scanner;
/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */

public class MakeChange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the amount of the bill: ");
		String billAmountStr = scanner.nextLine(); //returns user input as string
		double billAmount = Double.parseDouble(billAmountStr); // turns string into double

		System.out.println("Please enter the amount tendered: ");
		String tenderAmountStr = scanner.nextLine();

		double tenderAmount = Double.parseDouble(tenderAmountStr);
		double changeAmount = tenderAmount - billAmount;

		if((changeAmount) < 0) {
			System.out.format("The customer owes:  $%.2f", changeAmount * - 1);
		} else {
			System.out.format("The change required:  $%.2f", changeAmount);
		}




	}

}
