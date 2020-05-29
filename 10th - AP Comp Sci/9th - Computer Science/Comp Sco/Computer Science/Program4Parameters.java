import java.util.Scanner;
public class Program4Parameters{
	public static void main (String[]args){
			Scanner reader = new Scanner (System.in);
			System.out.println("Input value of base 1");
			int num = reader.nextInt();
			System.out.println("Input value of base 2");
			int num1 = reader.nextInt();
			System.out.println("Input value of height");
			int num2 = reader.nextInt();
			System.out.println(("The average value is "+(area(num, num1, num2))));


	}
		public static double area (int num, int num1, int num2){
			double area = ((num+num1)/2)*(double)num2;
			return area;
}
}