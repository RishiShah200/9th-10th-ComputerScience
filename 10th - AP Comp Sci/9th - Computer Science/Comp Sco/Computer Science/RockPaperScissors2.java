import java.util.Scanner;
	public class RockPaperScissors2{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
String comp = "";
String result = "";
int user = 0;
int computer = 0;
System.out.println("Please enter your difficulty. Easy, Medium, or Hard");
String dif = reader.nextLine();
if(dif.equals("Easy")){
System.out.println("Round 1");
System.out.print("Enter a RPS throw: ");
String choice = reader.nextLine();



switch(choice){
		case "Rock":
		comp = "Scissors";
		break;
		case "Paper":
		comp = "Rock";
		break;
		case "Scissors":
		comp = "Paper";
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
	switch(choice2){
			case "Rock":
			comp = "Scissors";
			break;
			case "Paper":
			comp = "Rock";
			break;
			case "Scissors":
			comp = "Paper";
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
		System.out.println("Round 3");
		System.out.print("Enter a RPS throw: ");
String choice3 = reader.nextLine();
switch(choice3){
		case "Rock":
		comp = "Scissors";
		break;
		case "Paper":
		comp = "Rock";
		break;
		case "Scissors":
		comp = "Paper";
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

}
//Easy ends here
else if(dif.equals("Medium")){
System.out.println("Round 1");
System.out.print("Enter a RPS throw: ");
String choice5 = reader.nextLine();
switch(choice5){
		case "Rock":
		comp = "Scissors";
		break;
		case "Paper":
		comp = "Scissors";
		break;
		case "Scissors":
		comp = "Rock";
		break;
}

		System.out.println("The computer selects: "+comp);
		{
		if(comp.equals("Rock")&&(choice5.equals("Rock")))
		result = "You tie!";
		else if(comp.equals("Paper")&&(choice5.equals("Paper")))
		result = "You tie!";
		else	if(comp.equals("Scissors")&&(choice5.equals("Scissors")))
		result = "You tie!";
	else	if(comp.equals("Rock")&&(choice5.equals("Paper")))
		result = "You win!";
	else	if(comp.equals("Rock")&&(choice5.equals("Scissors")))
		result = "You lose!";
	else	if(comp.equals("Paper")&&(choice5.equals("Rock")))
		result = "You lose!";
	else	if(comp.equals("Paper")&&(choice5.equals("Scissors")))
		result = "You Win!";
	else	if(comp.equals("Scissors")&&(choice5.equals("Rock")))
		result = "You Win!";
	else	if(comp.equals("Scissors")&&(choice5.equals("Paper")))
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
String choice6 = reader.nextLine();
	switch(choice6){
			case "Rock":
			comp = "Scissors";
			break;
			case "Paper":
			comp = "Scissors";
			break;
			case "Scissors":
			comp = "Rock";
			break;
	}

			System.out.println("The computer selects: "+comp);
			{
			if(comp.equals("Rock")&&(choice6.equals("Rock")))
			result = "You tie!";
			else if(comp.equals("Paper")&&(choice6.equals("Paper")))
			result = "You tie!";
			else	if(comp.equals("Scissors")&&(choice6.equals("Scissors")))
			result = "You tie!";
		else	if(comp.equals("Rock")&&(choice6.equals("Paper")))
			result = "You win!";
		else	if(comp.equals("Rock")&&(choice6.equals("Scissors")))
			result = "You lose!";
		else	if(comp.equals("Paper")&&(choice6.equals("Rock")))
			result = "You lose!";
		else	if(comp.equals("Paper")&&(choice6.equals("Scissors")))
			result = "You Win!";
		else	if(comp.equals("Scissors")&&(choice6.equals("Rock")))
			result = "You Win!";
		else	if(comp.equals("Scissors")&&(choice6.equals("Paper")))
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
		System.out.println("Round 3");
		System.out.print("Enter a RPS throw: ");
String choice7 = reader.nextLine();
switch(choice7){
		case "Rock":
		comp = "Scissors";
		break;
		case "Paper":
		comp = "Scissors";
		break;
		case "Scissors":
		comp = "Rock";
		break;
}

		System.out.println("The computer selects: "+comp);
		{
		if(comp.equals("Rock")&&(choice7.equals("Rock")))
		result = "You tie!";
		else if(comp.equals("Paper")&&(choice7.equals("Paper")))
		result = "You tie!";
		else	if(comp.equals("Scissors")&&(choice7.equals("Scissors")))
		result = "You tie!";
	else	if(comp.equals("Rock")&&(choice7.equals("Paper")))
		result = "You win!";
	else	if(comp.equals("Rock")&&(choice7.equals("Scissors")))
		result = "You lose!";
	else	if(comp.equals("Paper")&&(choice7.equals("Rock")))
		result = "You lose!";
	else	if(comp.equals("Paper")&&(choice7.equals("Scissors")))
		result = "You Win!";
	else	if(comp.equals("Scissors")&&(choice7.equals("Rock")))
		result = "You Win!";
	else	if(comp.equals("Scissors")&&(choice7.equals("Paper")))
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

}
	////////////
	else if(dif.equals("Hard")){
	System.out.println("Round 1");
	System.out.print("Enter a RPS throw: ");
	String choice8 = reader.nextLine();
	switch(choice8){
			case "Rock":
			comp = "Paper";
			break;
			case "Paper":
			comp = "Scissors";
			break;
			case "Scissors":
			comp = "Rock";
			break;
	}

			System.out.println("The computer selects: "+comp);
			{
			if(comp.equals("Rock")&&(choice8.equals("Rock")))
			result = "You tie!";
			else if(comp.equals("Paper")&&(choice8.equals("Paper")))
			result = "You tie!";
			else	if(comp.equals("Scissors")&&(choice8.equals("Scissors")))
			result = "You tie!";
		else	if(comp.equals("Rock")&&(choice8.equals("Paper")))
			result = "You win!";
		else	if(comp.equals("Rock")&&(choice8.equals("Scissors")))
			result = "You lose!";
		else	if(comp.equals("Paper")&&(choice8.equals("Rock")))
			result = "You lose!";
		else	if(comp.equals("Paper")&&(choice8.equals("Scissors")))
			result = "You Win!";
		else	if(comp.equals("Scissors")&&(choice8.equals("Rock")))
			result = "You Win!";
		else	if(comp.equals("Scissors")&&(choice8.equals("Paper")))
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
		String choice9 = reader.nextLine();
		switch(choice9){
				case "Rock":
				comp = "Paper";
				break;
				case "Paper":
				comp = "Scissors";
				break;
				case "Scissors":
				comp = "Rock";
				break;
		}

				System.out.println("The computer selects: "+comp);
				{
				if(comp.equals("Rock")&&(choice9.equals("Rock")))
				result = "You tie!";
				else if(comp.equals("Paper")&&(choice9.equals("Paper")))
				result = "You tie!";
				else	if(comp.equals("Scissors")&&(choice9.equals("Scissors")))
				result = "You tie!";
			else	if(comp.equals("Rock")&&(choice9.equals("Paper")))
				result = "You win!";
			else	if(comp.equals("Rock")&&(choice9.equals("Scissors")))
				result = "You lose!";
			else	if(comp.equals("Paper")&&(choice9.equals("Rock")))
				result = "You lose!";
			else	if(comp.equals("Paper")&&(choice9.equals("Scissors")))
				result = "You Win!";
			else	if(comp.equals("Scissors")&&(choice9.equals("Rock")))
				result = "You Win!";
			else	if(comp.equals("Scissors")&&(choice9.equals("Paper")))
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
	System.out.println("Round 3");
		System.out.print("Enter a RPS throw: ");
		String choice10 = reader.nextLine();
		switch(choice10){
				case "Rock":
				comp = "Paper";
				break;
				case "Paper":
				comp = "Scissors";
				break;
				case "Scissors":
				comp = "Rock";
				break;
		}

				System.out.println("The computer selects: "+comp);
				{
				if(comp.equals("Rock")&&(choice10.equals("Rock")))
				result = "You tie!";
				else if(comp.equals("Paper")&&(choice10.equals("Paper")))
				result = "You tie!";
				else	if(comp.equals("Scissors")&&(choice10.equals("Scissors")))
				result = "You tie!";
			else	if(comp.equals("Rock")&&(choice10.equals("Paper")))
				result = "You win!";
			else	if(comp.equals("Rock")&&(choice10.equals("Scissors")))
				result = "You lose!";
			else	if(comp.equals("Paper")&&(choice10.equals("Rock")))
				result = "You lose!";
			else	if(comp.equals("Paper")&&(choice10.equals("Scissors")))
				result = "You Win!";
			else	if(comp.equals("Scissors")&&(choice10.equals("Rock")))
				result = "You Win!";
			else	if(comp.equals("Scissors")&&(choice10.equals("Paper")))
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
}
}
}