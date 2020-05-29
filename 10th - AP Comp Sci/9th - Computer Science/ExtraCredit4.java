import java.util.Scanner;
public class ExtraCredit4{
	public static void main (String[]args){
Scanner reader = new Scanner (System.in);
System.out.println("Please enter the regular price of an item with no dollar sign and with a decimal");
double price = reader.nextDouble();
double Price = price;
reader.nextLine();
System.out.println("Please enter the department code");
String num2 = reader.nextLine();
switch(num2){
	case "310":
	Price = Price-(Price*.10);
	break;
	case "438":
	Price = Price-(Price*.12);
	break;
	case "652":
	Price = Price-(Price*.15);
	break;
	default :
	Price = Price-(Price*.05);





	}
	System.out.println("The original price of the item was "+ price);
	System.out.println("The sale price of the item is "+Price);
}
}