//example of using maths lang. PI

public class PiTest						//area of circle is Pi r squared in other words 3.142*(radius * radius)
										//circumference of circle is 2*(pi * Radius)

	{

	public static void main ( String [] args )

		{

		int radius = 6;
		double circ;
		System.out.println (" Radius " + radius);

		double mathPi = Math.PI;

		double area = mathPi * ( radius * radius );
		circ = 2 * mathPi * radius;


		System.out.print ( " with Pi formatted from\n\n " + Math.PI );
		System.out.println ();
		System.out.println ( "\n\n A circle of radius " + radius + " cm " + " has area of\n\n " + area );
		System.out.println ( "\n\n Circumference\n\n" + circ );

		System.out.printf ( "\n\n Area is %.2f ", area );
		System.out.println ( "\n\n" );

		System.out.printf ( " Circumference is %7.2f ", circ );
		System.out.println ( "\n\n" );


	}//end of main


}//end of class