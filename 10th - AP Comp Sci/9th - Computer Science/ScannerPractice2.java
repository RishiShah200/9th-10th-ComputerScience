import java.util.Scanner;
public class ScannerPractice2{
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);
					System.out.println("Please enter the radius of the cylinder: ");
					int radius = reader.nextInt();
					System.out.println("Please enter the height of the cylinder: ");
					int height = reader.nextInt();
					double volume = (3.1415)*((radius*radius))*height;
					System.out.println("The Volume is: "+ (double)volume+"\n");
					double surface = ((2*(3.1415))*(((radius*radius))))+(2*(3.1415))*(radius)*(height);
					System.out.println("The Surface area is :"+surface);



	}
}