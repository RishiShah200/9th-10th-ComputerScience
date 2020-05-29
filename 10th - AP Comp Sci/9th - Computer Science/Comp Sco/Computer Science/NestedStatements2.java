import java.util.Scanner;
public class NestedStatements2{
	public static void main (String[]args){
Scanner reader = new Scanner (System.in);
System.out.println("(F)orce, (D)istance, and (V)olume");
String choice = reader.nextLine();
if(choice.equals("F")){
	double equation = 2;
	System.out.println("(P)ounds to newtons or (N)ewtons to pounds");
	String choice2 = reader.nextLine();
	if(choice2.equals("P")){
	System.out.println("Please enter a number");
	double num = reader.nextDouble();
	double equation2 = (num*4.9);
	System.out.println(equation2);
}
else if(choice2.equals("N")){
	 System.out.println("Please enter a number");
	 double num2 = reader.nextDouble();
	System.out.println(equation);
	 double equation2  = (num2/4.9);
	System.out.println(equation2);
}
}
if(choice.equals("D")){
	double equation = 2;
	System.out.println("(F)eet to meters or (M)eters to feet");
	String choice3 = reader.nextLine();
	if(choice3.equals("F")){
	System.out.println("Please enter a number");
	double num2 = reader.nextDouble();
	double equation3 = (num2/3.28);
	System.out.println(equation3);
}
else if(choice3.equals("M")){
	 System.out.println("Please enter a number");
	 double num3 = reader.nextDouble();
	System.out.println(equation);
	 double equation3  = (num3*3.28);
	System.out.println(equation3);
}
}
if(choice.equals("V")){
	double equation = 2;
	System.out.println("(G)allons to liters or (L)iters to gallons");
	String choice4 = reader.nextLine();
	if(choice4.equals("G")){
	System.out.println("Please enter a number");
	double num3 = reader.nextDouble();
	double equation4 = (num3/3.79);
	System.out.println(equation4);
}
else if(choice4.equals("L")){
	 System.out.println("Please enter a number");
	 double num4 = reader.nextDouble();
	System.out.println(equation);
	 double equation4  = (num4*3.79);
	System.out.println(equation4);
}
}




}
}