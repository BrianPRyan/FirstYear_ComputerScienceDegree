//Program to take input from the screen, testing scanner class with chars

import java.util.Scanner;

	public class ScanChar

		{

		// ask the user to enter their name, assign the 1st character  read into a char variable

		public static void main ( String [] args )

			{		//Declare Scanner


			String input;
			char letter;

			System.out.println ( " Enter a word: " );
			Scanner scan = new Scanner ( System.in );
			input = scan.nextLine();//scans all information on the line untill hit enter
			letter = input.charAt(6);//SEE NOTE BELOW

			System.out.println ( " The word you typed: " + input );
			System.out.println ( " The 7th character you typed was: " + letter );//JAVA ALWAYS STARTS COUNTING AT 0


				}// end of main


}// end of class

