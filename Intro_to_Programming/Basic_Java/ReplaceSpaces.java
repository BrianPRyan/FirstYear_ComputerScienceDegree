//Strings intro. 2nd exercise
import java.util.*;

public class ReplaceSpaces

{

	public static void main (String [] args)

	{

		Scanner scan = new Scanner (System.in);
		String input = " ";
		String newName = " ";

		System.out.println("Please enter a string");
		input = scan.nextLine();

		newName = input.replace("  ", "*");
		System.out.println(newName);

	}//end of main
}//end of class