public class BatteryCharger
{

	//declare class attributes for the rateTable, the charge time and an int for best(minimum) cost
	private int[] rateTable;
	private int chargeTime;
	private int bestCost;
	public BatteryCharger(int[] rateTable, int chargeTime)
	{
			this.rateTable = rateTable;
			this.chargeTime = chargeTime;
	}

	private int getChargingCost(int startHour, int chargeTime)
	{
		bestCost = 0;
		for(int x = startHour;x<startHour + chargeTime;x++){
			bestCost+=rateTable[x % rateTable.length];
		}
		return bestCost;
	}

	private int getChargeStartTime(int chargeTime)
	{
		int cheap = 0;

		for(int x = 0;x<rateTable.length;x++){
			if(getChargingCost(x,chargeTime) < getChargingCost(cheap,chargeTime))
				cheap = x;
		}
		return cheap;
	}
	public String toString()
	{

		return "Hours of Charge Time: "+chargeTime+"\tStart Time: "+getChargeStartTime(chargeTime)+"\tMin Cost: "+bestCost;
	}

}