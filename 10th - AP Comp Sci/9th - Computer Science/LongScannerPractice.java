import java.util.Scanner;
public class LongScannerPractice{
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);
							System.out.println("Please enter the name of the student: "+"\n");
							String name = reader.nextLine();
							System.out.println("Please enter the name of the first class: "+"\n");
							String class1 = reader.nextLine();
							System.out.println("How many credits is this course worth: "+"\n");
							int credits = reader.nextInt();
							System.out.println("How many grade points did you earn: "+"\n");
							double points = reader.nextDouble();
							reader.nextLine();
							System.out.println("Please enter the name of the second class: "+"\n");
							String class2 = reader.nextLine();
							System.out.println("How many credits is this course worth: "+"\n");
							int credits1 = reader.nextInt();
							System.out.println("How many grade points did you earn: "+"\n");
							double credits2 = reader.nextDouble();
							reader.nextLine();
							System.out.println("Please enter the name of the third class: "+"\n");
							String class3 = reader.nextLine();
							System.out.println("How many credits is this course worth: "+"\n");
							int credits3 = reader.nextInt();
							System.out.println("How many grade points did you earn: "+"\n");
							double credits4 = reader.nextDouble();
							System.out.println("Bob Smith\n");
							System.out.println("Class\t\t\tCredits\t\tGrade Point\n");
							System.out.println("Science\t\t\t"+credits+"\t\t"+points+"\n");
							System.out.println(class2+"\t\t\t"+credits1+"\t\t"+credits2+"\n");
							System.out.println(class3+"\t"+credits3+"\t\t"+credits4+"\n");
							double GPA = (points+credits2+credits4)/3;
							System.out.println("GPA: "+GPA);
	}
}