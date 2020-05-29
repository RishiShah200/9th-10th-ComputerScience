import java.util.Scanner;
	public class Swithprograms2{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
double meters = 0.0;
double result = 0.0;
System.out.println("Available conversion units: ");
System.out.println("-Millimeters");
System.out.println("-Centimeters");
System.out.println("-Meters");
System.out.println("-Kilometers");
System.out.println("-Inches");
System.out.println("-Feet");
System.out.println("-Yards");
System.out.println("-Miles");
System.out.println("Please enter what unit you are starting with: ");
String choice = reader.nextLine();
System.out.println("Please enter what units you woul like to convert into: ");
String choice2 = reader.nextLine();
reader.nextLine();
System.out.println("Please enter how many "+choice);
int numbers = reader.nextInt();
switch(choice){
	case "Millimeters":
	meters = numbers/1000;
	break;
	case "Centimeters":
	meters = numbers/100;
	break;
	case "Meters":
	meters = numbers;
	break;
	case "Kilometers":
	meters = numbers*1000;
	break;
	case "Inches":
	meters = numbers/39.3701;
	break;
	case "Feet":
	meters = numbers/3.28084;
	break;
	case "Yards":
	meters = numbers/1.09361;
	break;
	case "Miles":
	meters = numbers*1609.34;
	break;
	default:
	System.out.println("You broke the code");
	break;
}
	switch(choice2){
			case "Millimeters":
			result = meters*1000;
			break;
			case "Centimeters":
			result = meters*100;
			break;
			case "Meters":
			result = meters;
			break;
			case "Kilometers":
			result = meters/1000;
			break;
			case "Inches":
			result = meters*39.3701;
			break;
			case "Feet":
			result = meters*3.28084;
			break;
			case "Yards":
			result = meters*1.09361;
			break;
			case "Miles":
			result = meters/1609.34;
			break;
			default:
			System.out.println("You broke the code");
	break;
}
		System.out.println(numbers+choice+" is equal to "+result+""+choice2);

}
}