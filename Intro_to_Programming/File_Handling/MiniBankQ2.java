//File Handling C.A. Assignment, Q2 Brian Ryan
import java.io.*;
import java.util.*;

public class MiniBankQ2

{

	public static void main (String []args) throws FileNotFoundException

	{

		//Prompt for the input and output file names

		Scanner console = new Scanner (System.in);
		System.out.print(" Enter Name of the File you want to work with: ");
		String inputFileName = console.next();
		System.out.print(" Enter Name of the File you want to Store the GBP conversion to: ");
		String outputFileName = console.next();

		//construct the Scanner and Printwriter objects for reading and writing

		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);

		while (in.hasNextLine())//scan the whole line for text

			{
				//declare variables
				String line = in.nextLine();
				boolean found = false;
				String accountBalanceS;
				double accountBalance;
				double accountBalanceC;
				int j = 0;

				for(int i = 0;!found && i <line.length();i++)
				{

						//scanning line untill : found
					char ch = line.charAt(i);
					if (ch == ':')

					{
						j ++;
					}

					if(j == 4)//when it reaches the 4th colon it takes the account balance and substrings it out from text, also trimming white space
						{
							accountBalanceS = line.substring(i + 1);
							accountBalance = Double.parseDouble(line.substring(i + 1).trim());
							out.println( " " + line );
							accountBalanceC = accountBalance * 1.25;//conversion to GBP
							out.println( " **The new Account Balance after GBP conversion is " + accountBalanceC + "**");//tried to use printf here but it was messing up the format of text in my file
							found = true;
						}//end if statement

				}//end of for statement

				if(!found)//if no colon was found, we skip the line
				{
					out.println( " " + line );
				}//end if statement

			}//end of while loop

		in.close();//saving and closing input file
		out.close();//saving and closing output file

	}//end of main

}//end of class
