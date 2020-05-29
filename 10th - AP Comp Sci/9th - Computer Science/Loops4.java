import java.util.Scanner;
public class Loops4{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
int q = 0;
int w = 0;
int e = 0;
int t = 0;
int r = 1;
int f = 0;
	System.out.println("How many scores would you like to input? ");
	int choice = reader.nextInt();
for(int i = 1;i<=choice;i++){
	System.out.print("Please enter test #"+i+":\n");
		int test = reader.nextInt();
		if(test<=75){
		t++;
		System.out.println("Would you like a retake?");
		reader.nextLine();
		String retake = reader.nextLine();
		switch(retake){
			case "Yes":
			System.out.println("Enter the score of your "+r+" retake");
			r++;
			int rtake = reader.nextInt();
			if((rtake>=90&&rtake<=100))
			q++;
			else if((rtake>=70&&rtake<=89))
			w++;
			else if((rtake>=1&&rtake<=69))
			e++;
			break;
}
}

		if((test>=90&&test<=100))
		q++;
		else if((test>=70&&test<=89))
		w++;
		else if((test>=1&&test<=69))
		e++;



		}
			System.out.println("Outstanding Scores: "+(q));
			System.out.println("Satisfactory Scores: "+(w));
			System.out.println("Unsatisfactory Scores: "+(e));
	}
}