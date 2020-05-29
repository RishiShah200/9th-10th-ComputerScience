import java.util.Scanner;
public class IfQuiz{
	public static void main (String[]args){
Scanner reader = new Scanner (System.in);
double price = 0.00;
double price2 = 0.00;
double price3 = 0.00;
System.out.println("Welcome to Ye Olde Ice Cream Shoppe!\n");
System.out.println("Prices are as follows:");
System.out.println("Chocolate:\t$2.50");
System.out.println("Vanilla:\t$2.00");
System.out.println("Sprinkles:\t$1.00");
System.out.println("Hot Fudge:\t$1.00\n");
System.out.println("What flavor would you like? ");
String choice = reader.nextLine();
System.out.println("Would you like sprinkles ");
String choice2 = reader.nextLine();
{
if(choice.equals("chocolate"))
price = 2.50;
else
price = 2.00;
}
{
if(choice2.equals("yes"))
price2 = 1.00;
else
price2 = 0.00;
}
{
if((choice.equals("chocolate")&&(choice2.equals("yes"))))
System.out.println("Would you like hot fudge");
String choice3 = reader.nextLine();
if(choice3.equals("yes"))
price3 = 1.00;
else
price3 = 0.00;
}
double FinalCost = price+price2+price3;
System.out.println("Total: $"+FinalCost);











	}
}