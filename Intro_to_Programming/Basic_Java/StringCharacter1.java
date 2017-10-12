//Strings intro. 1st exercise
import java.util.*;

public class StringCharacter1

{

	public static void main (String [] args)

	{

		Scanner scan = new Scanner (System.in);
		String input = " ";
		char stringChar;

		System.out.println("Please enter a string");
		input = scan.nextLine();

		stringChar = input.charAt(1);
		System.out.println("The second character in your string is:" + stringChar);

		stringChar = input.charAt(input.length()-2);
		System.out.println("The second last character in your string is:" + stringChar);

	}//end of main
}//end of class
