import java.util.Scanner;
	public class Ifstatements4{
	public static void main(String[]args){
	Scanner reader = new Scanner (System.in);
	System.out.print("Please enter a number : ");
		int num = reader.nextInt();
		if((num>=10 && num<=99)&&(num%2==1))
		System.out.println("You win!");
		else if ((num>=10 && num<=99)||(num%2==1))
			System.out.println("You're close");
		else if ((num<10 || num>99)&&(num%2==0))
			System.out.println("You lose");

	}
}