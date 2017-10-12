//Calculate interest earned on bank balance

public class BankInterest

{

	public static void main ( String [] args )

	{

		double bankBalance = 27550;
		double interestRate = 2.5;
		double divisor = 100;
		double interestEarned = ( bankBalance * interestRate ) / divisor;
		double updatedBalance = bankBalance + interestEarned;

		System.out.println ( " Current Bank Balance is " + bankBalance + " euros\n\n ");
		System.out.println ( " \n\nThe Interest Earned last year was " + interestEarned + " euros\n\n ");
		System.out.println ( " \n\nThe New Bank Balance is " + updatedBalance + " euros\n\n ");


	}//end of main

}//end of class