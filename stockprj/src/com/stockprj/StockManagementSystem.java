package com.stockprj;
import java.util.ArrayList;
import java.util.Scanner;

public class StockManagementSystem {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
    // create to empty arraylist to hold the stock
	ArrayList<Stock> stocks = new ArrayList<Stock>();
   // display the menu ask for user input

	int choice;
	do {
		System.out.println("1. Add Stock ");
		System.out.println("2. Remove Stock ");
		System.out.println("3. view Stock ");
		System.out.println("4. Exit");
		System.out.println("Enter your choice ");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			// ask for stock details
			System.out.println("Enter the stock name: ");
			String name = sc.next();

			System.out.println("Enter the stock quantity:  ");
			int quantity = sc.nextInt();

			System.out.println("Enter the stock price");
			double price = sc.nextDouble();

			// create a new stock object and add to arraylist

			Stock newStock = new Stock(name, quantity, price);
			stocks.add(newStock);// add()add new stock to arraylist
			System.out.println("Stock addeded sucessfully");
			break;

		case 2:
			// ask for the stock name and quantity remove

			System.out.println(" Enter the stock name: ");
			String stockName = sc.next();

			System.out.println("Enter quantity to remove: ");
			int removeQuantity = sc.nextInt();

			// loop through the stock to find a matching stock

			boolean stockFound = false;
			for (Stock stock : stocks) {
				if (stock.getName().equals(stockName)) {
					// if the stock not found remove the specific quantity
					stockFound = true;
					stock.removeQuantity(removeQuantity);
					System.out.println(" stock removed sucessfully");
					break;
				}
			}

				if (!stockFound) {
					System.out.println("stock not found");
				}
				break;

			case 3:
				// dispay the list of stock
				System.out.println("current stock");
				for (Stock stock : stocks) {
					System.out.println(stock.toString());
				}
				break;

			case 4:
				System.out.println("Existing the progrtam: ");
				break;

			default:
				System.out.println(" Invalud choice,try again");
				break;
			}

		} while (choice != 4);
		sc.close();
	}
}
