import java.util.Scanner;
public class MethodsQuiz{
	public static void main (String[]args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the length of your rectangle: ");
		int l = reader.nextInt();
		System.out.println("Please enter the width of your rectangle: ");
		int w = reader.nextInt();
		System.out.println("The perimeter of your rectangle is "+Perimeter(l, w)+" units");
		System.out.println("Please enter the first base of your trapezoid: ");
		double b1 = reader.nextDouble();
		System.out.println("Please enter the second base of your trapezoid: ");
		double b2 = reader.nextDouble();
		System.out.println("Please enter the height of your trapezoid: ");
		double h = reader.nextDouble();
		System.out.println("The area of your trapezoid is: "+area(b1, b2, h)+" square units");

}
	public static int Perimeter(int l, int w){
		int Perimeter = (2*l)+(2*w);
		return Perimeter;
	}

	public static double area (double b1, double b2, double h){
		double area = (((b1+b2))/(2))*h;
		return area;


}
}

