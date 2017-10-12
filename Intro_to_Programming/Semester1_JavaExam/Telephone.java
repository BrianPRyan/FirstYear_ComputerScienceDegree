//mock exam methods, classes and interactions Question.1
class Telephone
{
	//class variables
	private int phoneNo;
	private String area;
	private String type;

	//default constructor or 0-arg constructor
	public Telephone()
	{
		phoneNo = 64659;
		area = " Cashel ";
		type = " Samsung ";
	}

	//3-arg constructor
	public Telephone(int n, String a, String t)
	{
		phoneNo = n;
		area = a;
		type = t;
	}

	//getter and setter methods
	public int getPhoneNo()
	{
		return phoneNo;
	}
	public void setPhoneNo(int n)
	{
		phoneNo = n;
	}

	public String getArea()
	{
		return area;
	}
	public void setArea(String a)
	{
		area = a;
	}

	public String getType()
	{
		return type;
	}
	public void setType(String t)
	{
		type = t;
	}

	//overiding toString method(writing our own version of toString)
	public String toString ()
	{
	  return " The Phone Number is " + phoneNo + " The type of Phone you are using is " + type;
	}
}//end of class


