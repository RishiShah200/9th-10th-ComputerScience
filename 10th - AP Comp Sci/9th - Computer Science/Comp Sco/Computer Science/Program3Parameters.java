import java.util.Scanner;
public class Program3Parameters{
	public static void main (String[]args){
		Scanner reader = new Scanner (System.in);
		System.out.println("Input your first number");
		int num = reader.nextInt();
		System.out.println("Input your second number");
		int num1 = reader.nextInt();
		System.out.println("Input your third number");
		int num2 = reader.nextInt();
		System.out.println(("The average value is "+(avg(num, num1, num2))));

	}
		public static double avg (int num, int num1, int num2){
		double avg = (num+num1+num2)/3.0;
			return avg;
}
}