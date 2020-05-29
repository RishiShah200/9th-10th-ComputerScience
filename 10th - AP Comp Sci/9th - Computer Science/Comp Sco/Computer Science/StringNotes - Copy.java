public class StringNotes{
	public static void main (String[]args){
		String name = "Ms. Robles";
		String name2 = "Alexandria";
		String name3 = "Robles";
		String name4 = "robles";
// == CANNOT BE USED TO CHECK IF STRINGS ARE EQUAL
// The conditions we will make must be true statements as long as the two Strings are spelled an spaced the exact SAME WAY. In addition, they MUST HAVE the same Capitilization.

//1 - Check that a variable has a spcific String value
if(name.equals("Ms. Robles"))
		System.out.println("That's my name!");
	else
		System.out.println("That's not my name!");

//2 - Checks the specific String value to a variable.
	if("Alexandria".equals(name2))
		System.out.println("That's my name!");
			else
		System.out.println("That's not my name!");
//3 - Check that a String varable equals another String variable
		if(name2.equals(name3))
				System.out.println("That's my name!");
			else
				System.out.println("That's not my name!");
//Check wehen string is NOT (!) equal
		if(!name4.equals("Ms. Robles"));
			System.out.println("That's not my name!");
// To ignore capitalization
//equalsIgnoreCase
		if("Robles".equalsIgnoreCase("robles"))
			System.out.println("Same");
		else
			System.out.println("Not the same");

	}
}