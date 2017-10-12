//program to take user input and use maths function

import java.util.Scanner;

public class MathFunctions

	{

		public static void main ( String [] args )

			{
				//declare variables

				int num1;
				int num2;
				double sum;
				double difference;
				double product;
				double average;
				double distance;
				double max;
				double min;

				Scanner scan = new Scanner (System.in);

					// add code to read from keyboard

				System.out.print ( " \n\nEnter Number 1 ->\n\n " );
				num1 = scan.nextInt();

				System.out.print ( " \n\nEnter Number 2 ->\n\n " );
				num2 = scan.nextInt();
				System.out.println();

					//actual calculations and output statements

				sum = num1 + num2;
				System.out.printf ( " The sum is %10.2f\n\n " , sum );

				difference = num1 - num2;
				System.out.printf ( "\n\n The difference is %10.2f\n\n " , difference );

				product = num1 * num2;
				System.out.printf ( "\n\n The product is %10.2f\n\n " , product );

				average = (num1 + num2) / 2.0;
				System.out.printf ( "\n\n The average is %10.2f\n\n " , average );

				distance = Math.abs (difference);					//means the absolute value of the difference
				System.out.printf ( "\n\n The distance is %10.2f\n\n " , distance );

				max = Math.max ( num1, num2 );
				System.out.printf ( "\n\n The max is %10.2f\n\n " , max );

				min = Math.min ( num1, num2 );
				System.out.printf ( "\n\n The min is %10.2f\n\n " , min);
				System.out.println();

	}//end of main


}//end of class
