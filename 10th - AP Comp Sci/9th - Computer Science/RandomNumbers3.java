public class RandomNumbers3{
	public static void main (String[]args){
	int num = (int)(Math.random()*6+1);
	int num2 = (int)(Math.random()*10+1);
	int num3 = (int)(Math.random()*20+1);
	int sum = (int)(num+num2+num3);
	int product = (int)(num*num2*num3);
	int avg = (int)(sum/3);
	System.out.println("6-Sided Die: "+num);
	System.out.println("10-Sided Die: "+num2);
	System.out.println("20-Sided Die: "+num3);
	System.out.println("Sum Of Dice: "+sum);
	System.out.println("Product Of Dice: "+product);
	System.out.println("Average Of Dice: "+avg);







	}
}