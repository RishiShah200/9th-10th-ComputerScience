import java.util.Scanner;
public class NestedStatements{
	public static void main (String[]args){
Scanner reader = new Scanner (System.in);
System.out.println("Please enter a angle measure of a quadrilateral");
int angle = reader.nextInt();
System.out.println("Please enter a angle measure of a quadrilateral");
int angle2 = reader.nextInt();
System.out.println("Please enter a angle measure of a quadrilateral");
int angle3 = reader.nextInt();
System.out.println("Please enter a angle measure of a quadrilateral");
int angle4 = reader.nextInt();
if(angle==90){
if(angle2==90)
if(angle3==90)
if(angle4==90)
System.out.println("The quadrilateral is a rectangle");
}
else if(angle+angle2==180||angle2+angle3==180||angle3+angle4==180||angle4+angle==180){
	System.out.println("The quadrilateral is a parallelogram");
}
else
System.out.println("The quadrilateral has nothing special about it");





	}
}