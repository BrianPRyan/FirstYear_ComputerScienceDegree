//File Handling C.A. Assignment, Q1 Brian Ryan
import java.io.*;
import java.util.*;

public class MiniBankQ1

{

	public static void main (String []args) throws FileNotFoundException

	{

			//declare variables
		Scanner scan = new Scanner (System.in);
		String outputFileName="Customer.txt";
		String firstName;
		String surname;
		String location;
		String accountNumberS;
		int accountNumber;
		int i = 0;
		double accountBalance;
		boolean numberOnly = true;

			//creating new file to work with, new data will be saved with old data, not overwriting old data
		PrintWriter out = new PrintWriter (new FileOutputStream(new File(outputFileName),true));

		do
		{
				//Prompting user for details and give them the option to quit using X
			System.out.println(" Please enter the First Name or x to quit ");
			firstName = scan.nextLine();
			if(!firstName.equalsIgnoreCase("x"))//once X is not entered the user will be prompted for the questions below

				{
				System.out.println(" Please enter the Surname ");
				surname = scan.nextLine();
				System.out.println(" Please enter the Location ");
				location = scan.nextLine();
				System.out.println(" Please enter the Account Number ");
				accountNumberS = scan.nextLine();
					while(!(accountNumberS.length() == 6))//error handling to make sure account number is correct format, 6 digits
						{
							System.out.println(" Sorry this Account Number is not in the correct format, it must be 6 digits ");
							System.out.println(" Please enter the Correct Account number  ");
							accountNumberS=scan.nextLine();
						}
					i=0;
					numberOnly = true;
					while(i < accountNumberS.length())
						{
							if(!Character.isDigit(accountNumberS.charAt(i)))//Checking account number characters
								{
									numberOnly = false;
								}
								i++;
						}
							if(numberOnly)//converting account number from string to integer
								{
									accountNumber = Integer.parseInt(accountNumberS);
								}
							else
								{
									accountNumber=0;
								}

				System.out.println(" Please enter the Account Balance  ");
				accountBalance= scan.nextDouble();
				scan.nextLine();
					while(accountBalance < 50)//error handling to make sure account balance is over 50.00
						{
							System.out.println(" Sorry this Account Balance is not large enough ");
							System.out.println(" Please enter the Account Balance  ");
							accountBalance=scan.nextDouble();
							scan.nextLine();
						}

						//print all entered details to file
					out.print(firstName + " :\t ");
					out.print(surname + " :\t ");
					out.print(location + " :\t ");
					out.print(accountNumber + " :\t ");
					out.print(accountBalance + " \t ");
					out.println();
					}//end if

		}while(!firstName.equalsIgnoreCase("x"));

		out.close();//saving and closing file

		System.out.println(" This data has been written to the file " + outputFileName);

	}//end of main

}//end of class
