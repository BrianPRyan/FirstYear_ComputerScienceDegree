//first basic array
import java.io.*;
import java.util.Scanner;

public class FirstArray

{

	public static void main (String []args)

	{

		int numbers [] = new int [10];

		for (int i = 0; i < numbers.length; i++)
			{
				numbers[i] = i;
			}
		System.out.println(" Array numbers are " + numbers[0]);
		System.out.println(" Array numbers are " + numbers[1]);
		System.out.println(" Array numbers are " + numbers[2]);

		//loop to print array

		for (int i = 0; i < numbers.length; i++)
			{
				System.out.println(" Position " + i + " Contains " + numbers[i]);
			}


	}//end of main
}//end of class