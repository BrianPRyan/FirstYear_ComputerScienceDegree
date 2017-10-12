//Program to take input from screen using scanner class, Read in 2 numbers and print sum

import java.util.Scanner;

public class InputInt

	{

	public static void main ( String [] args )

		{

			//Declare Scanner

		Scanner scan = new Scanner ( System.in);

		int num1;
		int num2;
		int sum;

		System.out.println ( " Enter Number 1:\n\n " );
		num1 = scan.nextInt();

		System.out.println ( "\n\n Enter Number 2:\n\n " );
		num2 = scan.nextInt();

		sum = num1 + num2;
		System.out.println ( "\n\n The sum of " + num1 + " and " + num2 + " is: " + sum );

	}// end of main


}// end of class