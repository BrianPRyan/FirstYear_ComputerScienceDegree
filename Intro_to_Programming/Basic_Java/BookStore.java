//compute the price of an order from the total order price and the number of books that were ordered

import java.util.Scanner;

public class BookStore

	{

		public static void main ( String [] args )

			{
				//declare variables

				double numberOfBooks;
				double pricePerBook;
				double totalPriceOfBooks;
				double shippingCharge;
				double totalTax;
				double totalOrderCost;

				Scanner scan = new Scanner (System.in);

						// add code to read from keyboard

				System.out.print ( " \n\nEnter Number of Books Sold ->\n\n " );
				numberOfBooks  = scan.nextDouble();
				System.out.print ( " \n\nEnter Price per Book Sold ->\n\n " );
				pricePerBook = scan.nextDouble();
				System.out.println();

					//calculations

				totalPriceOfBooks = numberOfBooks * pricePerBook;
				shippingCharge = numberOfBooks * 2;
				totalTax = (totalPriceOfBooks * 7.5) / 100;
				totalOrderCost = totalPriceOfBooks + shippingCharge + totalTax;

								//output to screen
				System.out.printf ( " The Total Price of the books is; %4.2f " , totalPriceOfBooks );
				System.out.println("\n\n");
				System.out.printf ( " The Total cost of Shipping is; %7.2f " , shippingCharge );
				System.out.println("\n\n");
				System.out.printf ( " The Total Price of tax is; %11.2f " , totalTax );
				System.out.println("\n\n");
				System.out.printf ( " The Total Order Price is; %13.2f " , totalOrderCost);
				System.out.println("\n\n");



		}//end of main

}//end of class
