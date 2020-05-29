public class TaxItemRunner
{
	public TaxItemRunner()
	{
		double dealerCost = 20000.0;
		double dealerMarkup = 2500.0;
		double taxRate = .10;
		//declare the three variables that will be necessary to instantiate
		//a Vehicle (they are stated in part b of the question). They should all be doubles.

		Vehicle truck = new Vehicle (dealerCost, dealerMarkup, taxRate);
		//declare a variable called truck that is of the TaxableItem type but
		//instantiates itself as a Vehicle with the proper parameter set
		System.out.println("This is the purchase price of the vehicle: " + truck.purchasePrice());
		//output the purchase price for the truck
		truck.changeMarkup(1000);
		//modify the markUp value to 1000 from 2500
		Vehicle truck2 = new Vehicle (dealerCost, dealerMarkup, taxRate);
		//declare a new variable called truck2 that is of the TaxableItem type but
		//instantiates itself as a Vehicle with the proper parameter set
		System.out.println("This is the purchase price of the vehicle 2: " + truck.purchasePrice());
		//output that trucks purchase price
	}

	public static void main(String[] args)
	{
		TaxItemRunner app=new TaxItemRunner();
	}

}