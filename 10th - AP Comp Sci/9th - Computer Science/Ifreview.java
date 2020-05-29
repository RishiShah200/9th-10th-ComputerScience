import java.util.Scanner;
public class Ifreview{
	public static void main (String[]args){
	Scanner reader = new Scanner (System.in);
	System.out.println("Please enter a number");
	double num1 = reader.nextDouble();
	System.out.println("Please enter another number");
	double num2 = reader.nextDouble();
	System.out.println("Please enter another number");
	double num3 = reader.nextDouble();
	System.out.println("Please enter another number");
	double num4 = reader.nextDouble();
	System.out.println("Please enter another number");
	double num5 = reader.nextDouble();
	System.out.println("The mean of the 5 numbers is "+mean(num1,  num2,  num3,  num4,  num5 ));



	}
		public static double mean (double num1, double num2, double num3, double num4, double num5){
			double mean = (num1+num2+num3+num4+num5)/5;
			return mean;
}
}