import java.util.Scanner;
public class If_ElseStatementsPractice2{
	public static void main (String[]args){
Scanner reader = new Scanner (System.in);
	System.out.println("Please enter a number: ");
	int num1 = reader.nextInt();
	System.out.println("Please enter a second number: ");
	int num2 = reader.nextInt();
System.out.println(Parity(num1, num2));

}






		public static String Parity(int a, int b){
			String par = "a";
			if(a>b)
			par = a+" is greater than "+b;
			else if (b>a)
			par = b+ " is greater than "+a;
			else if (a==b)
			par = a+" is equal to "+b;
			return par;

}
}