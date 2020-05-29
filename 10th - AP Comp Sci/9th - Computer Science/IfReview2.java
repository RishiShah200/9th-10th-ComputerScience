import java.util.Scanner;
public class IfReview2{
	public static void main(String[]args){
Scanner reader = new Scanner (System.in);
	System.out.println("Please enter a number");
	int num = reader.nextInt();
	divisible(num);



	}
		public static void divisible(int a){
			if(a%11 == 0)
			System.out.println("The number is divisible by 11");
			else
			System.out.println("The number is not divisible by 11");
			if(a%2 == 0)
			System.out.println("The number is divisible by 2");
			else
			System.out.println("The number is not divisible by 2");
			if(a%3 == 0)
			System.out.println("The number is divisible by 3");
			else
			System.out.println("The number is not divisible by 3");
			if(a%5 == 0)
			System.out.println("The number is divisible by 5");
			else
			System.out.println("The number is not divisible by 5");
			if(a%7 == 0)
			System.out.println("The number is divisible by 7");
			else
			System.out.println("The number is not divisible by 7");


}
}