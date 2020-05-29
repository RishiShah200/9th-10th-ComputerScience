import java.util.Scanner;
	public class WhileLoops4{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
	System.out.print("Enter as many grades as you want. Enter the number -1 when you want to stop");
	System.out.println();
	int totalScores = 0;
	int a = 0;
	int b = 0;
	while(b<1){
		System.out.print("Enter a grade: ");
		int grade1 = reader.nextInt();
		if(grade1!=-1){
		totalScores+= grade1;
		a++;
						}
		else{
			System.out.print("This is the average of the test grades "+(totalScores/a));
			b++;
			System.out.println();
		}
	}






}
}