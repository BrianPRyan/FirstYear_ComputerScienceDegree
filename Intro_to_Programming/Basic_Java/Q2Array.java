//totuorial q2 Arrays
import java.io.*;
import java.util.Scanner;

public class Q2Array

{

	public static void main (String []args)

	{

		int numbers [] = new int [10];

		int sum = 0;
		int i = 0;

		while (i < numbers.length)
			{
				numbers [i]= i + 6;
				sum = sum + numbers[i];
				i ++;
			}

		//loop to print array

		for (i = 0; i < numbers.length; i++)
			{
					System.out.println(" Element " + i + " Contains " + numbers[i]);
			}

	}//end of main

}//end of class