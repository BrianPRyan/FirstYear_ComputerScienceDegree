//Strings intro. 4th exercise
import java.util.*;

public class StringEquality

{

	public static void main (String [] args)

	{

		Scanner scan = new Scanner (System.in);
		String input = " ";
		String input2 = " ";

		System.out.println("Please Enter a String");
		input = scan.nextLine();

		System.out.println("Please Enter Another String");
		input2 = scan.nextLine();

		boolean test;
		test = input.equalsIgnoreCase(input2);

		System.out.println (" The first string you entered equals the second string " + test);

	}//end of main

}//end of class