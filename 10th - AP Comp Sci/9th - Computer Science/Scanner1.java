import java.util.Scanner;
public class Scanner1{
	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = reader.nextLine();
				System.out.println("What is the temperature?");
				int temperature = reader.nextInt();
				reader.nextLine();
System.out.println("What is the weather?");
				String weather = reader.nextLine();
				System.out.println("What is your GPA?");
				double gpa = reader.nextDouble();
				System.out.println("Hi "+name+"! "+"It is currently "+temperature+" degrees and "+weather+".");
				System.out.println("Today is a great day to get a "+gpa+" average!");





	}
}