//File Handling C.A. Assignment, Q3 Brian Ryan
import java.io.*;
import java.util.*;

public class MiniBankQ3

{

	public static void main (String []args) throws FileNotFoundException

	{



		//prompt for the input file name
		System.out.println("****************");
		System.out.println(" Please enter the name of the File you want to view-> ");
		System.out.println("****************");

		Scanner console = new Scanner(System.in);
		String inputFileName = console.nextLine();
		String inputText;
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		System.out.println("****************");

		while(in.hasNext())//scanning line of file for text
		{
			inputText = in.nextLine();
			System.out.println(inputText);
		}

		System.out.println("****************");
		System.out.println("This is the data from the File Customer.txt");
		System.out.println("****************");

		in.close();//closing file

		//prompt for the input file name
		System.out.println();
		System.out.println("****************");
		System.out.println(" Please enter the name of the File you want to view-> ");
		System.out.println("****************");

		Scanner scan = new Scanner(System.in);
		String inputFileName1 = scan.nextLine();
		String inputText1;
		File inputFile1 = new File(inputFileName1);
		Scanner in1 = new Scanner(inputFile1);
		System.out.println("****************");

		while(in1.hasNext())//scanning line of file for text
		{
			inputText1 = in1.nextLine();
			System.out.println(inputText1);
		}

		System.out.println("****************");
		System.out.println("This is the data from the File CustomerFX.txt");
		System.out.println("****************");
		System.out.println();

		in1.close();//closing file

	}//end of main

}//end of class
