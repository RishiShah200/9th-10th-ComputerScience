import java.util.Scanner;
public class IfReviewProgram3{
	public static void main(String[]args){
Scanner reader = new Scanner (System.in);
			System.out.println("Would you like (F)rench Fries or (I)ce cream?  ");
			String choice = reader.nextLine();
			System.out.println("Would you like (S)oda or (L)emonade?  ");
			String choice2 = reader.nextLine();
			Food(choice);
			Drinks(choice2);
			System.out.println(Cost+(Food(choice)+Drinks(choice2)));


		}
				public static double Food(String a){
				double Food = 1.0;
				if(a.equals("F"))
				 Food = 5.0;
			else if(a.equals("I"))
				 Food = 3.75;
				return Food;

		}
				public static double Drinks(String a){
						double Drinks = 1.0;
						if(a.equals("S"))
						Drinks = 2.25;
						else if (a.equals("L"))
						Drinks = 3.5;
				return Drinks;
		}
				public static double Cost(double a, double b){
					double Cost = a+b;
					double cost = (Cost*.07)+Cost;
						return Cost;
}
			public static String foods (double a){
				String foods = "a";
				if(a == 5.0)
				foods = "1 french fry";
				else
					foods = "1 ice cream";

				return foods;

}
			public static String drinks (double a){
				String drinks = "a";
				if(a == 2.25)
				drinks = "1 soda";
				else
				drinks = "1 lemonade";
				return drinks;


}
}



