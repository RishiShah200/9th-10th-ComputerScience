import java.util.Scanner;
public class If_ElseStatementsPractice1{
	public static void main (String[]args){
Scanner reader = new Scanner (System.in);
	System.out.print("Please enter a number: ");
	int num = reader.nextInt();
	System.out.println(num+" is "+Parity(num));



	}
		public static String Parity(int a){
		String par;
		if(a%2 == 0)
	par = "an even number. ";
		else
			par = "an odd number. ";
		return par;

}
}