import java.util.Scanner;
	public class RockPaperScissors{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
String comp = "";
String result = "";
int user = 0;
int computer = 0;
System.out.println("Round 1");
System.out.print("Enter a RPS throw: ");
String choice = reader.nextLine();
int random = (int)(Math.random()*3)+1;
int random2 = (int)(Math.random()*3)+1;
int random3 = (int)(Math.random()*3)+1;
switch(random){
		case 1:
		comp = "Rock";
		break;
		case 2:
		comp = "Paper";
		break;
		case 3:
		comp = "Scissors";
		break;
}
		System.out.println("The computer selects: "+comp);
		{
		if(comp.equals("Rock")&&(choice.equals("Rock")))
		result = "You tie!";
		else if(comp.equals("Paper")&&(choice.equals("Paper")))
		result = "You tie!";
		else	if(comp.equals("Scissors")&&(choice.equals("Scissors")))
		result = "You tie!";
	else	if(comp.equals("Rock")&&(choice.equals("Paper")))
		result = "You win!";
	else	if(comp.equals("Rock")&&(choice.equals("Scissors")))
		result = "You lose!";
	else	if(comp.equals("Paper")&&(choice.equals("Rock")))
		result = "You lose!";
	else	if(comp.equals("Paper")&&(choice.equals("Scissors")))
		result = "You Win!";
	else	if(comp.equals("Scissors")&&(choice.equals("Rock")))
		result = "You Win!";
	else	if(comp.equals("Scissors")&&(choice.equals("Paper")))
		result = "You Lose!";

		{
				if(result.equals("You win!"))
				user++;
				else if (result.equals("You lose"))
				computer++;
				else if (result.equals("You Tie!"))
				user++;
				computer++;
				System.out.println(result);

	}
	}


	System.out.println("Round 2");
	System.out.print("Enter a RPS throw: ");
String choice2 = reader.nextLine();
switch(random2){
		case 1:
		comp = "Rock";
		break;
		case 2:
		comp = "Paper";
		break;
		case 3:
		comp = "Scissors";
		break;
}
		System.out.println("The computer selects: "+comp);
		{
		if(comp.equals("Rock")&&(choice2.equals("Rock")))
		result = "You tie!";
		else if(comp.equals("Paper")&&(choice2.equals("Paper")))
		result = "You tie!";
		else	if(comp.equals("Scissors")&&(choice2.equals("Scissors")))
		result = "You tie!";
	else	if(comp.equals("Rock")&&(choice2.equals("Paper")))
		result = "You win!";
	else	if(comp.equals("Rock")&&(choice2.equals("Scissors")))
		result = "You lose!";
	else	if(comp.equals("Paper")&&(choice2.equals("Rock")))
		result = "You lose!";
	else	if(comp.equals("Paper")&&(choice2.equals("Scissors")))
		result = "You Win!";
	else	if(comp.equals("Scissors")&&(choice2.equals("Rock")))
		result = "You Win!";
	else	if(comp.equals("Scissors")&&(choice2.equals("Paper")))
		result = "You Lose!";
		System.out.println(result);
		{
						if(result.equals("You win!"))
						user++;
						else if (result.equals("You lose"))
						computer++;
						else if (result.equals("You Tie!"))
						user++;
						computer++;

}
	}

	System.out.println("Round 3");
	System.out.print("Enter a RPS throw: ");
	String choice3 = reader.nextLine();
switch(random3){
				case 1:
				comp = "Rock";
				break;
				case 2:
				comp = "Paper";
				break;
				case 3:
				comp = "Scissors";
				break;
		}
				System.out.println("The computer selects: "+comp);
				{
				if(comp.equals("Rock")&&(choice3.equals("Rock")))
				result = "You tie!";
				else if(comp.equals("Paper")&&(choice3.equals("Paper")))
				result = "You tie!";
				else	if(comp.equals("Scissors")&&(choice3.equals("Scissors")))
				result = "You tie!";
			else	if(comp.equals("Rock")&&(choice3.equals("Paper")))
				result = "You win!";
			else	if(comp.equals("Rock")&&(choice3.equals("Scissors")))
				result = "You lose!";
			else	if(comp.equals("Paper")&&(choice3.equals("Rock")))
				result = "You lose!";
			else	if(comp.equals("Paper")&&(choice3.equals("Scissors")))
				result = "You Win!";
			else	if(comp.equals("Scissors")&&(choice3.equals("Rock")))
				result = "You Win!";
			else	if(comp.equals("Scissors")&&(choice3.equals("Paper")))
				result = "You Lose!";
				System.out.println(result+"\n");
				{
				if(result.equals("You win!"))
					user++;
					else if (result.equals("You lose!"))
						computer++;
						else if (result.equals("You Tie!"))
						computer++;
						user++;
					}
			}
{
		if(computer>user)
		System.out.println("Result: Lose!");
		else if (user>computer)
		System.out.println("Result: Win!");
		else if (user == computer)
		System.out.println("Result: Tie!");
		else if(user == 0)
		System.out.println("Result: Lose!");
}



}
}