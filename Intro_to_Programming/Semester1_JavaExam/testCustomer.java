//mock exam methods, classes and interactions Question.3
import java.util.*;
public class TestCustomer
{
 	public static void main(String [] args)
 	{
		Customer c1 = new Customer();
		Telephone t1 = new Telephone();
		c1.setPhone(t1);
		System.out.println(c1);
		System.out.println();
		System.out.println(t1);
		System.out.println("*******");

		Customer c2 = new Customer("Dom","Cashel", new Telephone());
		Telephone t2 = new Telephone();
		c2.setPhone(t2);
		c2.buyNewPhone(t2);
		System.out.println(c2);
		System.out.println("*******");
		t2.setType(" Apple I-Phone ");
		System.out.println("\n new phone ******* \n" +c2);
		System.out.println(t2);
		//c2.upgradePhone(t2);
		System.out.println(c2.upgradePhone(t2));
		System.out.println();

	}//end of main
}//end of class

