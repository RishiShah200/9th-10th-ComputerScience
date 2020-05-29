public class BatteryRunner
{
	public BatteryRunner()
	{

		//store costs from table on 1st page of question in an array called rateTable
		int[] rateTable={50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};

		BatteryCharger charge=new BatteryCharger(rateTable,1);
		System.out.println(charge);
		charge=new BatteryCharger(rateTable,2);
		System.out.println(charge);
		charge=new BatteryCharger(rateTable,7);
		System.out.println(charge);
		charge=new BatteryCharger(rateTable,30);
		System.out.println(charge);

	}

	public static void main(String[] args)
	{
		BatteryRunner app=new BatteryRunner();
	}
}