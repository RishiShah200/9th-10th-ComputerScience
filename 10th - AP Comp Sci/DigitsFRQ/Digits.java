import java.util.ArrayList;
public class Digits
{
	private ArrayList<Integer> digitList;
	public Digits(int num)
	{
		digitList = new ArrayList<Integer>();
		if (num == 0){
		  digitList.add(0);
		}
		while (num > 0){
		  digitList.add(0, num % 10);
		  num /= 10;
    	}
	}

	public ArrayList<Integer> getDigitList(){
		return digitList;
	}

	public boolean isStrictlyIncreasing()
	{
		for(int x = 1;x<digitList.size();x++){
			if(digitList.get(x-1) < digitList.get(x))
				return true;

		}
	return false;
	}
}