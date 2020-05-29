import java.util.Scanner;
	public class SwithesQuiz{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
double cost = 0.00;
double COST = 0.00;
String Fchoice = "";
String DAYS = "";
	System.out.println("Entrance Cost");
	System.out.println("\t\t\tHotdog : $2.00");
	System.out.println("\t\t\tFries :  $3.00");
	System.out.println("\t\t\tApple Pie : $5.00");
	System.out.println("\t\t\tIce Cream : $1.00");
	System.out.println("Monday : $5.00");
	System.out.println("Tuesday : $4.00");
	System.out.println("Wednesday : $3.00");
	System.out.println("All Other Days : $2.00");

	System.out.println("What day would you like to visit the park?");
	String day = reader.nextLine();
	System.out.println("What would you like to eat?");
	String food = reader.nextLine();

switch(day){
	 case "Monday":
	 cost = 5.00;
	 DAYS = "Monday";
	 break;
	 case "Tuesday":
	 	 cost = 4.00;
	 	 DAYS = "Tuesday";
	 break;
	 case "Wednesday":
	 	 cost = 3.00;
	 	 DAYS = "Wednesday";
	 break;
	 case "All Other Days":
	 DAYS = "All Other Days";
	 	 cost = 2.00;
	 break;
	 default:
	 System.out.println("You have entered an incorrect option");
	 break;
 }

 switch(food){
	 case "Hotdog":
	 COST = 2.00;
	 Fchoice = "Hotdog";
	 break;
	 case "Fries":
	 	 COST = 3.00;
	 	 Fchoice = "Fries";
	 break;
	 case "Apple Pie":
	 System.out.println("Would you like Ice Cream?");
	 String choice2 = reader.nextLine();

	if(choice2.equals("Yes")){
	 COST = 6.00;
	 Fchoice = "Apple Pie with Ice Cream";
 }
	 else if((food.equals("Apple Pie"))&&(choice2.equals("No"))){
 			COST = 5.00;
			Fchoice = "Apple Pie without Ice Cream";
}
	 break;
}
double finalcost = (cost+COST);
System.out.println("You visited the park on "+DAYS+" and ordered "+Fchoice+ "."+" The total cost of the trip is $"+finalcost);




		}
	}