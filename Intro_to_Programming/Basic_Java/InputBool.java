//program to take imput from screen using Scanner Class. To read variable (true or false)

import java.util.Scanner;

	public class InputBool

		{

		public static void main (String [] args )

			{
				//Declare Scanner

			Scanner scan = new Scanner (System.in);
			boolean flag;

				//type prompt

			System.out.println ( " Enter true or false here: " );
			flag = scan.nextBoolean();

			System.out.println ( " You entered: " + flag );

		}//end of main

}//end of class