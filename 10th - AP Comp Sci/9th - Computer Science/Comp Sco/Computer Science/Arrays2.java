import java.util.Scanner;
public class Arrays2{
	public static void main (String[]args){
Scanner reader = new Scanner (System.in);
			System.out.println("Program 1");
			int sum = 0;
				int[] array3 = new int[5];
				for(int j = 0;j<array3.length;j++){
					array3[j] = (int)(Math.random()*20)+1;
					System.out.print(array3[j]+" ");
													}
			System.out.println("Program 2");
			String[] b = new String[6];
			String names = " ";
		for(int x = 0;x<b.length;x++){
			System.out.print("\nPlease enter a name: ");
			b[x] = reader.nextLine();
			names+=b[x]+" ";
								}
			System.out.print(names);

			System.out.println("Program 3");








	}
	}