import java.util.Scanner;
	public class WhileLoops2 {
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
	System.out.print("Please enter a value: ");
	int num = reader.nextInt();
	int num2 = num;
	System.out.print("The powers of "+num+" that are less than 10000 are ");
	while(num<10000){
		int c = num2*num;
		if(c>10000){
		System.out.print("and "+num+".");
		num *=num2;
	}
		else{
		System.out.print(num+", ");
		num *= num2;
	}
					}
}
}