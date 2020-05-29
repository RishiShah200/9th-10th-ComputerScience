public class Customer
{
	private String name;
	private int idNum;

	public Customer(String name, int idNum)
	{
			this.name = name;
			this.idNum = idNum;
	}

	public String getName()
	{
		return name;
	}

	public int getD()
	{
		return idNum;
	}
	public String toString(){
		return "Name: " + getName() + " ID: " + getD();
	}

	public int compareCustomer(Customer other)
	{
		if(getName().compareTo(other.getName()) > 0)
			return 1;
			if(getName().compareTo(other.getName()) < 0)
			return -1;
		if(getD() > other.getD())
			return 1;
		if(getD() < other.getD())
			return -1;
		return 0;
	}

}