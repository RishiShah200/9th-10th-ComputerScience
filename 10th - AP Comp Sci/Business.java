public class Business implements Comparable<Business>{
	private String name;
	private String town;
	private String phone;
	private double yelp;
	public Business(String name,String town,String phone,double yelp){
		this.name = name;
		this.town = town;
		this.phone = phone;
		this.yelp = yelp;


	}
	public String getName(){
		return name;
	}
	public String getTown(){
		return town;
	}
	public String getPhone(){
		return phone;
	}
	public double getYelp(){
		return yelp;
	}
	public String toString(){
		return name + ", " + town + ", " + phone + ", " + yelp;
	}
	public int compareTo(Business bus){
		if(getYelp() > bus.getYelp())
			return  1;
		if(getYelp() < bus.getYelp())
			return  -1;
		if(getPhone().length() > bus.getPhone().length())		//figure out how to correctly compare this
			return 1;
		if(getPhone().length() < bus.getPhone().length())
			return -1;
		return  0;
	}


}