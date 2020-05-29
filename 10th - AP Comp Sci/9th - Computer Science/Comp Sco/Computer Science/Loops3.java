import java.util.Scanner;
public class Loops3{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
int q = 0;
int w = 0;
int e = 0;
	System.out.println("How many scores would you like to input? ");
	int choice = reader.nextInt();
for(int i = 1;i<=choice;i++){
	System.out.print("Please enter test #"+i+":\n");
		int test = reader.nextInt();

		if((test>=90&&test<=100))
		q++;
		else if((test>=70&&test<=89))
		w++;
		else if((test>=1&&test<=69))
		e++;
		if(w>=1 || e>=1){
				System.out.print("Would you like a retake?");
				String h = reader.nextLine();
				switch(h){
					case "Yes":
					System.out.println("Enter the score of your "+i+" retake");
					break;
			}
		}
				int retake = reader.nextInt();
				if((retake>=90&&retake<=100))
				q++;
				else if((retake>=70&&retake<=89))
				w++;
				else if((retake>=1&&retake<=69))
				e++;
		}
			System.out.println("Outstanding Scores: "+q);
			System.out.println("Satisfactory Scores: "+w);
			System.out.println("Unsatisfactory Scores: "+e);
	}
}
