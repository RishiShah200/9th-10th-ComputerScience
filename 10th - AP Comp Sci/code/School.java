public class School{

	private int money;
	private String name;
	private boolean inSession;
	private double cost;

	public School(int money, String name, boolean inSession, double cost){


		this.money = money;
		this.name = name;
		this.inSession = inSession;
		this.cost = cost;

	}

	public int getMoney(){
		return money;
	}
	public String getName(){
		return name;
	}
	public boolean getInSession(){
		return inSession;
	}
	public double getCost(){
		return cost;
	}

	public double setCost(double c){
		return cost = c;
	}
	public String setName(String x){
		return name = x;
	}

	public String toString(){
		return "The cost to go to the school is $" + money + " The name of the school is " + name + " \nThe school is " + inSession + " It costs $" + cost + " to go to the school";
	}

}

