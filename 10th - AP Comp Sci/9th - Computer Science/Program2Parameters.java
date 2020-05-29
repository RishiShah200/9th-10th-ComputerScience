import java.util.Scanner;
public class Program2Parameters{
	public static void main (String[]args){
	Scanner reader = new Scanner(System.in);
	System.out.println("Input your first number");
	int y2 = reader.nextInt();
	System.out.println("Input your second number");
	int y1 = reader.nextInt();
	System.out.println("Input your third number");
	int x2 = reader.nextInt();
	System.out.println("Input your last number");
	int x1 = reader.nextInt();
		System.out.println(slope(y2, y1, x2, x1));
}
		public static double slope (int y2, int y1, int x2, int x1){
			double slope = ((y2-y1))/((x2-x1));
			return slope;
}
}