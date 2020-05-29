import java.util.Scanner;
public class IFailedMyTest{
	public static void main (String[]args){
Scanner reader = new Scanner (System.in);
System.out.println("Please enter your weight");
double weight = reader.nextDouble();
reader.nextLine();
double Weight= weight;
System.out.println("Please enter a planet witht the first letter of the planet capital");
String planet = reader.nextLine();
		switch(planet){

			case "Earth":
			weight = weight;
			break;
			case "Jupiter":
			weight = weight*2.65;
			break;
			case "Mars":
			weight = weight*0.39;
			break;
			case "Mercury":
			weight = weight*0.38;
			break;
			case "Neptune":
			weight = weight*1.23;
			break;
			case "Pluto":
			weight = weight*0.05;
			break;
			case "Saturn":
			weight = weight*1.17;
			break;
			case "Uranus":
			weight = weight*1.05;
			break;
			case "Venus":
			weight = weight*0.78;
			break;
		}
		System.out.println("Your weight on earth is "+Weight);
		System.out.println("Your weight on "+planet+" is "+weight);




	}
}