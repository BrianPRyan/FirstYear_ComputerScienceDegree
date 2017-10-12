//Strings intro. 5th exercise
import java.util.*;

public class StringToNum

{

	public static void main (String [] args)

	{

		String input;
		int number;
		int square;

		Scanner scan = new Scanner (System.in);
		System.out.println ("Enter number or X to quit");
		input = scan.next();

		if  (input.equals("x"))
		{
			System.out.println("Goodbye");
		}

		else
		{
			number = Integer.valueOf(input);//changing string to integer
			square = number * number;
			System.out.println (number + " Squared " + square);
			String s2 = String.valueOf(number);
			System.out.println (" convert back " + s2);
		}

	}//end of main

}//end of class