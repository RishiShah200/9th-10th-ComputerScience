import java.util.Scanner;
public class Loops2{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
int q = 0;
int w = 0;
int e = 0;
System.out.print("How many scores would you like to input? ");
int rand = (int)(Math.random()*60)+41;
System.out.println(rand);
for(int i = 1;i<=rand;i++){
	System.out.print("Please enter test #"+i+":\n");
	int test = reader.nextInt();

if((test>=90&&test<=100))
q++;
else if((test>=70&&test<=89))
w++;
else if((test>=1&&test<=69))
e++;
		}
			System.out.println("Outstanding Scores: "+q);
			System.out.println("Satisfactory Scores: "+w);
			System.out.println("Unsatisfactory Scores: "+e);
	}
}
