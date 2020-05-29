import java.util.Scanner;
public class IFailedMyTest2{
	public static void main (String[]args){
		double value;
		double b = 0;
Scanner reader = new Scanner (System.in);
System.out.println("Please enter an option. sum, average, product, or difference ");
String choice = reader.nextLine();
reader.nextLine();
System.out.println("Please enter a number");
double num = reader.nextDouble();
System.out.println("Please enter a number");
double num2 = reader.nextDouble();
System.out.println("Please enter a number");
double num3 = reader.nextDouble();
double sum = num+num2+num3;
double average = (num+num2+num3)/3;

switch(choice){
	case "sum":
	value = num+num2+num3;
	System.out.println(value);
	break;
	case "average":
	value = (num+num2+num3)/3;
	System.out.println(value);
	break;
	case "product":
		if((num>num2)&&(num2>num3))
			 b = num*num3;
			else if ((num2>num3)&&(num3>num))
			 b = num2*num;
			else if ((num3>num)&&(num>num2))
		 b = num3*num2;
	 System.out.println(b);
	break;
	case "difference":
	if((num>num2)&&(num2>num3))
		 b = num-num3;
		else if ((num2>num3)&&(num3>num))
		 b = num2-num;
		else if ((num3>num)&&(num>num2))
		 b = num3-num2;
		 else if ((num2>num)&&(num3>num2))
		 b = num3-num;
		 else if ((num3>num2)&&(num>num3))
		 b = num-num2;
		 else if ((num>num3)&&(num2>num))
		 b = num2-num3;
		 System.out.println(b);
	break;




}




}
}