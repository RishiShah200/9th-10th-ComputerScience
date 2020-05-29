public class USETHIS{
public static void main(String[]args){

System.out.println("Round 2");
System.out.print("Enter a RPS throw: ");
String choice2 = reader.nextLine();
switch(random2){
		case 1:
		comp = "Rock";
		break;
		case 2:
		comp2 = "Paper";
		break;
		case 3:
		comp3 = "Scissors ";
		break;
}
		System.out.println("The computer selects: "+comp2);
		if(comp2.equals("Rock")&&(choice2.equals("Rock")))
		result = "You tie!";
		if(comp2.equals("Paper")&&(choice2.equals("Paper")))
		result = "You tie!";
		if(comp2.equals("Scissors")&&(choice2.equals("Scissors")))
		result = "You tie!";
		if(comp2.equals("Rock")&&(choice2.equals("Paper")))
		result = "You win!";
		if(comp2.equals("Rock")&&(choice2.equals("Scissors")))
		result = "You lose!";
		if(comp2.equals("Paper")&&(choice2.equals("Rock")))
		result = "You lose!";
		if(comp2.equals("Paper ")&&(choice2.equals("Scissors")))
		result = "You Win!";
		if(comp2.equals("Scissors")&&(choice2.equals("Rock")))
		result = "You Win!";
		if(comp2.equals("Scissors")&&(choice2.equals("Paper")))
		result = "You Lose!";
		System.out.println(result);
		System.out.println("Round 3");
		System.out.print("Enter a RPS throw: ");
		String choice3 = reader.nextLine();
switch(random3){
				case 1:
				comp = "Rock";
				break;
				case 2:
				comp2 = "Paper";
				break;
				case 3:
				comp3 = "Scissors ";
				break;
		}
				System.out.println("The computer selects: "+comp3);
				if(comp3.equals("Rock")&&(choice3.equals("Rock")))
				result = "You tie!";
				if(comp3.equals("Paper")&&(choice3.equals("Paper")))
				result = "You tie!";
				if(comp3.equals("Scissors")&&(choice3.equals("Scissors")))
				result = "You tie!";
				if(comp3.equals("Rock")&&(choice3.equals("Paper")))
				result = "You win!";
				if(comp3.equals("Rock")&&(choice3.equals("Scissors")))
				result = "You lose!";
				if(comp3.equals("Paper")&&(choice3.equals("Rock")))
				result = "You lose!";
				if(comp3.equals("Paper ")&&(choice3.equals("Scissors")))
				result = "You Win!";
				if(comp3.equals("Scissors")&&(choice3.equals("Rock")))
				result = "You Win!";
				if(comp3.equals("Scissors")&&(choice3.equals("Paper")))
				result = "You Lose!";
		System.out.println(result);
		
		}
	}