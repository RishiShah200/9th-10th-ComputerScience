import java.util.Scanner;
public class IfStatementsDay2{
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
		System.out.print("Please enter a number : ");
		int num4 = reader.nextInt();
		System.out.println("\n"+EvenOdd(num4));



	}
			public static String EvenOdd(int a){
				String EvenOdd = "a";
				if((a>10 && a%2==0)){
				EvenOdd = "The number is greater than 10 and even\n";
}
				else if(a>10 && a%2==1){
				EvenOdd = "The number is greater than 10 and odd\n";
}
				else if(a<10 && a%2==0){
					EvenOdd = "The number is less than 10 and even\n";

}
				else if(a<10 && a%2==1){
					EvenOdd = "The number is less than 10 and odd\n";

}
					return EvenOdd;
}

}
