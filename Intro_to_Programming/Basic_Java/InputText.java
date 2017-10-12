// Program to take input from screen using Scanner Class

import java.util.Scanner;

public class InputText

	{

			//asks the user to enter their name. Print hello followed by the name use the scanner class

	public static void main (String [] args)

		{

			//declare scanner

		Scanner scan = new Scanner (System.in);
		String input;
		String form;

			//type prompt
		System.out.print ( " Hi there, What is your name? " );
		input = scan.nextLine();//reads the whole line until you hit enter

		System.out.println ( " Hello there " + input + " How are you today? ");
		form = scan.nextLine();

		System.out.println ( " It has been great talking to you today " + input );

		}//end of main method

}//end of class
