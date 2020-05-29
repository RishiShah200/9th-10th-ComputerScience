import java.util.Scanner;
	public class Swithprograms3{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
String zodiac = "";
System.out.println("Please enter hour of the day: ");
int hour = reader.nextInt();
reader.nextLine();
System.out.println("Please enter (A)M or (P)M: ");
String choice = reader.nextLine();
switch(hour){
	case 1:
		if(choice.equals("A"))
		zodiac = "Ox";
		else
		zodiac = "Goat";
	break;
	case 2:
		if(choice.equals("A"))
		zodiac = "Ox";
		else
		zodiac = "Goat";
	break;
	case 3:
			if(choice.equals("A"))
			zodiac = "Tiger";
			else
		zodiac = "Monkey";
	break;
	case 4:
			if(choice.equals("A"))
			zodiac = "Tiger";
			else
		zodiac = "Monkey";
	break;
	case 5:
			if(choice.equals("A"))
			zodiac = "Rabbit";
			else
		zodiac = "Roster";
	break;
	case 6:
			if(choice.equals("A"))
			zodiac = "Rabbit";
			else
		zodiac = "Rooster";
	break;
	case 7:
			if(choice.equals("A"))
			zodiac = "Dragon";
			else
		zodiac = "Dog";
	break;
	case 8:
			if(choice.equals("A"))
			zodiac = "Dragon";
			else
		zodiac = "Dog";
	break;
	case 9:
			if(choice.equals("A"))
			zodiac = "Snake";
			else
		zodiac = "Pig";
	break;
	case 10:
			if(choice.equals("A"))
			zodiac = "Snake";
			else
		zodiac = "Pig";
	break;
	case 11:
			if(choice.equals("A"))
			zodiac = "Horse";
			else
		zodiac = "Rat";
	break;
	case 12:
			if(choice.equals("A"))
			zodiac = "Rat";
			else
		zodiac = "Horse";
	break;
}
			System.out.println("Your chinese zodiac is the "+zodiac);
}
}