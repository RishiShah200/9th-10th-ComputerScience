import java.util.Scanner;
public class ScannerQuiz{
	public static void main (String[]args){
		Scanner reader = new Scanner (System.in);
		System.out.print("Enter the first student's name: ");
		String name = reader.nextLine();
		System.out.print("Enter the grade for tests/quizzes: ");
		int quizzes = reader.nextInt();
		System.out.print("Enter the grade for projects: ");
		int projects = reader.nextInt();
		System.out.print("Enter the grade for participation: ");
		int participation = reader.nextInt();
		System.out.print("\n");
		System.out.print("Enter the grade for homework: ");
		int homework = reader.nextInt();
		reader.nextLine();
		System.out.print("\n");
	 	double AVGFINALGRADE = ((0.6)*(quizzes))+((0.15)*(projects))+((0.10)*(homework))+((0.15)*(participation));
		System.out.print("Enter the second student's name: ");
		String name2 = reader.nextLine();
		reader.nextLine();
		System.out.print("Enter the grade for tests/quizzes: ");
		int quizzes2 = reader.nextInt();
		System.out.print("Enter the grade for projects: ");
		int projects2 = reader.nextInt();
		System.out.print("Enter the grade for participation: ");
		int participation2 = reader.nextInt();
		System.out.print("\n");
		System.out.print("Enter the grade for homework: ");
		int homework2 = reader.nextInt();

		double AVGFINALGRADE2 = ((0.6)*(quizzes2))+((0.15)*(projects2))+((0.10)*(homework2))+((0.15)*(participation2));
		System.out.print("\n");
		System.out.println("Name\t\t"+"Tests/Quizzes\t"+"Projects\t"+"Participation\t"+"Homework\t"+"Final Grade");
		System.out.println(name+"\t"+quizzes+"\t\t"+projects+"\t\t"+participation+"\t\t"+homework+"\t\t"+AVGFINALGRADE);
		System.out.println(name2+"\t"+quizzes2+"\t\t"+projects2+"\t\t"+participation2+"\t\t"+homework2+"\t\t"+AVGFINALGRADE2);




































	}
}