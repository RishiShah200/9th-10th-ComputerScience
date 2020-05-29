import java.util.Scanner;
	public class Tutoring{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
int practice = 0;
int questions = 0;
	System.out.println("Welcome to the multiplication tutor");
	System.out.print("What is your name? ");
	String name = reader.nextLine();
	System.out.println("Let's see how you good are at multiplication " + name);
	System.out.print("Type -1 at any time to exit and see your score");
	System.out.println();
	int totalScores = 0;
	int a = 0;
	int b = 0;
	while(b==0){
	int rand = (int)(Math.random()*10)+1;
	int rand2 = (int)(Math.random()*10)+1;
		System.out.print("What is "+rand+"*"+rand2+"? ");
		int answer = reader.nextInt();
		if(answer==rand*rand2){
			System.out.println("Correct!");
			practice++;
								}
		else if(answer==-1){
		b++;
		System.out.println("Let's see, " +name+"! You got "+practice+" out of "+questions+" correct");
		if(((practice/questions)*100)<50){
			System.out.print("You really need to practice!");
											}
		else if(((practice/questions)*100)>50&&((practice/questions)*100)<85){
			System.out.print("You almost got it!");
																			}
		else if(((practice/questions)*100)>85&&((practice/questions)*100)<=100){
			System.out.print("You've mastered multiplication!");
																			}
							}
		else
		System.out.println("Sorry! The correct answer is "+rand*rand2);
		questions++;

			}
		System.out.println();
}
}