import java.util.Scanner;
public class HangmanProject{
	public static void main (String[]args){
		Scanner reader = new Scanner (System.in);
		System.out.println("Welcome to Hangman");
		System.out.println("You will have only 6 incorrect guesses to correctly guess the word or else the game game will end");
		int guesses = 6;
		int rcount = 0;
		int enter = 0;
		int dif = 0;
		int num = (int)(Math.random()*10)+0;
		String finalWord = wordChoice1(num);		//Uses a method with a list of 10 words and randomly selects one
		int temp = 0;
		int temp1 = 0;
		int lettercnt = 0;
		boolean ok = false;
		boolean done = false;
		System.out.println("Choose a difficulty level for your game from 1-3 with 3 being the hardest and 1 being the easiest");
		dif = reader.nextInt();		//Elaboration with different difficulty levels (harder words)
		while(dif<1||dif>3){		//Makes sure the input is valid
			System.out.println("The difficulty you have selected is not allowed. Please reselect your choice");
			dif = reader.nextInt();
		}
		if(dif==1)		//Allows the user to select which difficulty level which then calls a method to choose the word. Different methods for each type of word
			finalWord = wordChoice1(num);
		if(dif==2)
			finalWord = wordChoice2(num);
		if(dif==3)
			finalWord = wordChoice3(num);
reader.nextLine();
		String[] lettersGuessed = new String [25];		//Huge array so that the user can guess many letters
		String[] output = new String [finalWord.length()+1];
		String[] wordFinal = new String [finalWord.length()+1];
		wordFinal = finalWord.split("");		//Splits the randomly picked word at each character and puts it in an array
		for(int i = 0;i<output.length;i++){		//Fills the output array (_ s _ _ h) with _ at the beginning
			output[i] = "_";
		}
		for(int i = 0;i<lettersGuessed.length;i++)		//Fills the array for lettersGuessed by the user with spaces which will be replaced when the user guesses a letter
			lettersGuessed[i]=" ";
		System.out.println(finalWord);
		while(guesses!=0){		//While loop condition that only runs when the number of misses the user has is not equals to zero
			System.out.println("Misses left "+guesses);
			System.out.println("Letters guessed so far: ");
			for(int i = 0;i<lettersGuessed.length;i++)
				System.out.print(lettersGuessed[i]+" ");		//Prints the letters the user has guessed so far
			System.out.println();
			if(output[temp].equals(wordFinal[temp1])&&temp==finalWord.length()-1){		//Checks to see if the user has won and will break and stop the game
				guesses=0;
				break;
			}
			if(guesses!=0)		//Only asks if the user still has guesses left
				System.out.print("Guess a LOWERCASE letter: ");
				String letter = reader.nextLine();
				letter = letter.toLowerCase();
			if(rcount!=0){		//Checks to see if the letter they entered has already been entered before
				for(int i = 0;i<lettersGuessed.length;i++){
					while(rcount!=0 && letter.equals(lettersGuessed[i])){
					System.out.println("You already guessed this letter. Guess again: ");
					letter = reader.nextLine();
					}
				}
			}
			for(int i = 0;i<finalWord.length();i++){
				if(finalWord.substring(i,i+1).equals(letter)){		//Checks to see if the letter they entered is part of the final word and if it is adds the letter to the output array in the correct spot
					done=true;
					output[i] = letter;
					lettercnt++;
				}
			}
			for(int i = 0;i<finalWord.length();i++){
				if(output[i].equals(finalWord.substring(i,i+1))&&i==finalWord.length()-1&&lettercnt==finalWord.length()){//Checks to see if the user has won and if they did it outputs that they won
					temp=i;
					temp1=i;
					System.out.println("You have won the game. The word you correctly guesses was "+finalWord);
					guesses=0;
					break;
				}

			}
			lettersGuessed[rcount] = letter;		//Adds the letter the user guesses to the array of the letters the use has guesses for permanent storage
			rcount++;
		System.out.println();
		for(int i = 0;i<finalWord.length();i++)
			System.out.print(output[i]+" ");		//Outputs the correct letters the user has so far (w_r_i_)
			System.out.println();
			if(output[temp].equals(wordFinal[temp1])&&temp==finalWord.length()-1){		//Again checks to see if the user has won and will break if they did and stop the game
				guesses=0;
				break;
			}
			else if(done==true){
				System.out.println("Found "+letter);		//Checks to see if the letter they entered is part of the final word
			}
			else if(done==false){
				System.out.println("Didn't find "+letter);		//Checks to see if they letter they entered is not part of the final word
				guesses--;
			}
			else
				break;

			done=false;
			if(guesses==0){		//If the user ran out of guesses then they lose the game and the game ends.
				System.out.println("You have lost the game. You did not guess the word. The words was "+finalWord);
				break;
			}
			temp=0;		//Resets variables after 1 iteration of the loop
			temp1=0;
			//rcount=0;
		}

	}
		public static String wordChoice1(int a){		//Methods for word difficulty
			String[] answers = {"cat","bat","pie","rat","sat","fat","mat","cat","dog","hi"};
			String realWord = answers[a];
			return realWord;
		}
		public static String wordChoice2(int a){
				String[] answers = {"apple","pear","orange","clouds","earth","heat","funny","laptop","fruits","sauce"};
				String realWord = answers[a];
				return realWord;
		}
		public static String wordChoice3(int a){
				String[] answers = {"ergophobia","backpack","sriracha","xanthosis","computers","fortnite","sleeping","football","keyboard","jalapenos"};
				String realWord = answers[a];
				return realWord;
		}

}
