import java.util.Scanner;
	public class WhileLoops2A{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
		int rand = (int)(Math.random()*10)+1;
		int userscore = 5;
		while(userscore>0){
			System.out.print("Please enter a guess for the correct number between 1 to 10: ");
			int guess = reader.nextInt();
			if(guess!=rand){
			System.out.println("Incorrect answer");
			userscore--;
							}
			else if(guess==rand){
			System.out.print("Correct! The number was "+rand+". Your score is "+userscore+".");
			userscore = -1;
			System.out.println();
									}

						}
			if(userscore==0)
			System.out.print("You lose. You have run out of tries. The number was "+rand+".");



	}
	}