import java.util.Scanner;
	public class Ifstatements2{
	public static void main(String[]args){
	Scanner reader = new Scanner (System.in);
System.out.print("Please enter a number : ");
		int num = reader.nextInt();
		System.out.println("\n"+EvenOdd(num));
		System.out.print("Please enter a number : ");
		int num2 = reader.nextInt();
		System.out.println("\n"+EvenOdd(num2));
		System.out.print("Please enter a number : ");
		int num3 = reader.nextInt();
		System.out.println("\n"+EvenOdd(num3));
	}
		public static String EvenOdd(int a){
						String EvenOdd = "a";
						if((a%11==0 && a%2==0)){
				EvenOdd = "The number "+ a +" is both even and divisible by 11\n";
}
		else if((a%11==0 || a%2==0)){
				EvenOdd = "The number "+a+" is either even or divisible by 11\n";

}
		else if((a%11!=0 && a%2!=0)){
					EvenOdd = "The number "+a+" is not even nor divisible by 11\n";
}
				return EvenOdd;
}
}