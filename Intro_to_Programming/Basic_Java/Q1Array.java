//totuorial q1 Arrays
import java.io.*;
import java.util.Scanner;

public class Q1Array

{

	public static void main (String []args)

	{

		//example declaring an array and printing the array
		//int numbers [] = {0,5,0,0,20,0,11,15,0,13}
		int numbers [] = new int [10];
		int count = 0;
		numbers[1]= 5;
		numbers[4]= 20;
		numbers[7]= 15;
		numbers[9]= 13;
		numbers[6]= 11;

		//printing the array without a loop
		System.out.println(" Element 0 contains " + numbers[0]);
		System.out.println(" Element 1 contains " + numbers[1]);
		System.out.println(" Element 2 contains " + numbers[2]);
		System.out.println(" Element 3 contains " + numbers[3]);
		System.out.println(" Element 4 contains " + numbers[4]);
		System.out.println(" Element 5 contains " + numbers[5]);
		System.out.println(" Element 6 contains " + numbers[6]);
		System.out.println(" Element 7 contains " + numbers[7]);
		System.out.println(" Element 8 contains " + numbers[8]);
		System.out.println(" Element 9 contains " + numbers[9]);
		System.out.println(" \n**************\n ");

		//loop to print array

		for (int i = 0; i < numbers.length; i++)
			{
				System.out.println(" Element " + i + " Contains " + numbers[i]);
			}
				System.out.println(" \n**************\n ");

		//loop through the array and output message if value equals zero
		for (int i = 0; i < numbers.length; i++)
			{
				if(numbers[i]==0)
				{
					System.out.println(" Element in position " + i + " Equals Zero ");
					count ++;
				}
			}

			System.out.println(" I found " + count + " Zeros ");


	}//end of main

}//end of class















