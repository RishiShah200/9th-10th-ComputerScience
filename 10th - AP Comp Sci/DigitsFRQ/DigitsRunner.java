import java.util.ArrayList;
public class DigitsRunner
{
	public DigitsRunner()
	{
		Digits d1=new Digits(15704);
		Digits d2=new Digits(0);
		Digits d3=new Digits(01467);
		Digits d4=new Digits(7);
		Digits d5=new Digits(1356);
		Digits d6=new Digits(1336);
		Digits d7=new Digits(1536);
		Digits d8=new Digits(65310);

		System.out.println(d1.isStrictlyIncreasing());

		System.out.println(d2.getDigitList());
		System.out.println(d3.getDigitList());

		//write code that will check to see if the ArrayLists were filled correctly

		//write code that will test the instantiations of the Digits class
		//to make sure that they return the correct boolean value.
	}

	public static void main(String[] args)
	{
		DigitsRunner app=new DigitsRunner();
	}
}