//totuorial q4 Arrays
import java.io.*;
import java.util.Scanner;

public class Q4Array

{

	public static void main (String []args)

	{

		double [] numbers = new double [12];
		int i = 0;

		Scanner scan = new Scanner (System.in);
		while (i < numbers.length)
			{
				System.out.println(" Enter number " + i + " of 12 for array ");
				numbers[i]=scan.nextDouble();
				i++;
			}

		//loop to print array
		for (i = 0; i < numbers.length; i++)
			{
				System.out.println(" Element " + i + " Contains " + numbers[i]);
			}

	}//end of main

}//end of class