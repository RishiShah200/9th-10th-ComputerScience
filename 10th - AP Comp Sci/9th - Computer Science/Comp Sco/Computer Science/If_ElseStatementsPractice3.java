import java.util.Scanner;
public class If_ElseStatementsPractice3{
	public static void main (String[]args){
Scanner reader = new Scanner (System.in);
	System.out.println("Please enter a number");
	double num = reader.nextDouble();
	reader.nextLine();
	System.out.println("Would you like to (a)dd 2, (s)ubtract 2, (m)ultiply by 2, (d)ivide by 2, or (r)aise to the 2nd power: ");
	String choice = reader.nextLine();
		System.out.print((Parity1(choice, num))+Parity(choice, num));


}
		public static double Parity(String a, double b){
		double q = 1.0;
		if(a.equals("a"))
		q = b+2;
	else if(a.equals("s"))
		q = b-2;
	else if(a.equals("m"))
		q = b*2;
	else if(a.equals("d"))
		q = b/2;
	else if(a.equals("r"))
		q = b*b;
		return q;

}
		public static String Parity1(String a, double b){
				String q = "sdf";
				if(a.equals("a"))
				q = "The result when adding 2 to "+b+" is ";
			else if(a.equals("s"))
				q = "The result when subtracting 2 from "+b+" is ";
			else if(a.equals("m"))
				q = "The result when multiplying 2 to "+b+" is ";
			else if(a.equals("d"))
				q = "The result when dividing "+b+" by 2 is";
			else if(a.equals("r"))
				q = "The result when raising "+b+" to the power of 2 is ";
		return q;
}
}