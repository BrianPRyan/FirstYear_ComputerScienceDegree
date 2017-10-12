//Strings intro. 3rd exercise
import java.util.*;

public class StringCase

{

	public static void main (String [] args)

	{

		Scanner scan = new Scanner (System.in);
		String input = " ";

		String upperStr = " ";
		String lowerStr = " ";
		String replaceString = " ";
		String doubleBlank = " ";
		String singleBlank = " ";
		int compare = 0;

		System.out.println("Please Enter a String");
		input = scan.nextLine();
		upperStr = input.toUpperCase();
		lowerStr = input.toLowerCase();

		System.out.println("Substring in Upper Case is" + upperStr);
		System.out.println("Substring in Lower Case is" + lowerStr);

		replaceString = input.replace(doubleBlank, singleBlank);
		System.out.println("Replaced double blanks =" + replaceString);

		//2 more further examples of replace
		replaceString = input.replace("a","xx");
		System.out.println("Replaced String =" + replaceString);

		replaceString = input.replaceAll("a","xx");
		System.out.println("Replaced ALL String =" + replaceString);

		compare = input.compareTo("abc");
		System.out.println("Result of compare" + compare);

	}//end of main

}//end of class


