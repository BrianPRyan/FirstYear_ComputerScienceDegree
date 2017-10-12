//mock exam methods, classes and interactions Question.2
class Customer
{
	//class variables
	private int id;
	private String name;
	private String address;
	private Telephone phone;

	// default constructor or 0-arg constructor
	public Customer ()
	{
 		id = 12345;
	    name = " Brian ";
	    address = " Cashel ";
	    phone = new Telephone();
	}

	// all-arg constructor
	public Customer (int i,String n, String a, Telephone t)
	{
		id = i;
		name = n;
		address = a;
		phone = t;
	}

	public Customer (String n, String a, Telephone t)
	{
		name = n;
		phone = t;
		address = a;
	}

	//getter and setter methods
	public int getId()
	{
		return id;
	}
	public void setId(int i)
	{
		id = i;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}

	public String getAddress()
	{
		return address;
	}
	public void setAddress(String a)
	{
		address = a;
	}

	public Telephone getPhone()
	{
		return phone;
	}
	public void setPhone(Telephone t)
	{
		phone = t;
	}

	//overiding toString method(writing our own version of toString)
	public String toString ()
	{
		return " The Customer ID is " + id + " The Customer Name is " + name + " The Customer Address is " + address + phone;
	}

	//methods
	public void buyNewPhone(Telephone t)
	{
		phone = t;
	}

	public String upgradePhone(Telephone t)
	{
		phone = t;
		//System.out.println (" Phone is Upgraded ");
		return " The Phone is Upgraded ";
	}


}//end of class
