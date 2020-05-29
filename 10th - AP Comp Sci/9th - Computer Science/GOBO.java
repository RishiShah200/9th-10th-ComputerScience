import java.util.Scanner;
public class GOBO{
	public static void main(String[]args){
Scanner reader = new Scanner (System.in);
System.out.print("Would you like (F)rench Fries or (I)ce cream?");
String choice = reader.nextLine();
System.out.println("Would you like (S)oda or (L)emonade?");
String choice2 = reader.nextLine();
double food = 1.00;
String Drinks = "a";
String Food = "a";
double drinks = 1.00;

{
if(choice.equals("F"))
  food = 5.00;
Food = "Your order is 1 french fries";
 if(choice.equals("I"))
	food = 3.75;
Food = "Your order is 1 ice cream";
}
{
if(choice2.equals("S"))
drinks = 2.25;
Drinks = " and 1 soda";

if(choice2.equals("L"))
drinks = 3.5;
Drinks = " and 1 lemonade";
}
System.out.print(Food+Drinks);
System.out.print("The price is "+((food+drinks)*1.07));


	}
}