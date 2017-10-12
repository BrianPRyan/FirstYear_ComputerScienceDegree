/**Program to demonstrate reading a single word

Program to take input from screen using Scanner class

note scan.next() reads until the first space

scan.nextLine() reads to the end of the line
*/

import java.util.Scanner;

public class InputName

	{

		public static void main ( String [] args )

			{

			//Declare Scanner

		Scanner scan = new Scanner ( System.in );
		String firstName;
		String surname;
		String fullName;
		String address;

			//Type Prompt

		System.out.print ( " Enter your first name here:\n\n " );
		firstName = scan.next();//only read a word untill you hit a blank
		scan.nextLine();

		System.out.print ( " \n\nEnter your surname here:\n\n " );
		surname = scan.next();
		scan.nextLine();

		System.out.print ( " \n\nEnter your address here:\n\n " );
		address = scan.next();

		System.out.println ( " \n\nIt has been great talking to you today " + firstName + " " + surname + " from Cashel\n\n" );


	}//end of main method

}//end of class

