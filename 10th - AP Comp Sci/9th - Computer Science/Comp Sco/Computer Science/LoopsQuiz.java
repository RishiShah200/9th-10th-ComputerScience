import java.util.Scanner;
	public class LoopsQuiz{
		public static void main (String[]args){
	Scanner reader = new Scanner (System.in);
		int x = 0;
		int odd = 0;
		int even = 0;
		int ok = 0;
		while(x==0){
			ok++;
			System.out.print("Enter a value: ");
			int value = reader.nextInt();
			int avg = value/ok;
			if(value%2==0){
				even++;
						}
			else if(value%2==1){
				odd++;
								}
			reader.nextLine();
			System.out.println("Would you like to enter another value(Y/N)?: ");
			String choice = reader.nextLine();
			if(choice.equals("N")||choice.equals("n")){
				x--;

			System.out.print("You entered "+odd+" odd numbers and "+even+" even numbers. The average of the values is "+3*avg+".");
														}

					}

	}
	}