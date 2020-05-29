public class fgfg{
	public static void main(String[]args){

	// Variables
	String name; //The name of the quarterback
	int attempts; // Number of attempts
	int completions; // Number of completions
	int yards; // Total Yards
	int touchdowns; // Touchdowns
	int interceptions; // Interceptions

	// Declare and instantiate Scanner object
	Scanner keyboard = new Scanner(System.in);

	// Prompt user to input the name quarterback
	System.out.print("Enter quarteback's name>");
	name = keyboard.nextLine();

	// Prompt user to input attempts
	System.out.print("Enter number of attempts>");
	attempts = keyboard.nextInt();

	// Prompt user to input completions
	System.out.print("Enter number of completions>");
	completions = keyboard.nextInt();

	//Prompt user to input total yards
	System.out.print("Enter total yards>");
	yards = keyboard.nextInt();

	//Prompt user to input touchdowns
	System.out.print("Enter number of touchtowns>");
	touchdowns = keyboard.nextInt();

	//Prompt user to input number of interceptions
	System.out.print("Enter number of interceptions>");
	interceptions = keyboard.nextInt();

	//Calculation variables
	double comp; //percentage of completions per attempt
	double yds; // average yards gained per attempt
	double tds; //percentage of touchdown passes per attempt
	double ints; //percentages of interceptions per attempt
	double QBER; //Quarterback Efficiency rating
	System.out.println("\\QBER Ananlysis for " + name+ "COMP = " + comp+ "YDS = " + yds+ "TDS = " + tds+ "INTS = " + ints+ "\\QBER = " + QBER);

	}
}