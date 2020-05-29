import java.util.Scanner;
public class ScannerPractice3{
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);
						System.out.println("Please enter your name: "+"\n");
						String name = reader.nextLine();
						System.out.println("Please enter your first score: ");
						int score1 = reader.nextInt();
						System.out.println("Please enter your second test score: ");
						int score2 = reader.nextInt();
						double average = (score1+score2)/2;
						System.out.println("Rishi Shah has an average of "+average+"%");





	}
}