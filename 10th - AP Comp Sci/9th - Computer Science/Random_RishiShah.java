public class Random_RishiShah{
	public static void main(String[]args){
		int num1= (int)(Math.random()*19+0);
		int num2= (int)(Math.random()*13-8);
		int num3= (int)(Math.random()*17+10);
		int num4= (int)(Math.random()*56+37);
		int num5= (int)(Math.random()*46+43);
		int sum = (int)(num1+num2+num3+num4+num5);
		double average = (double)((double)sum/5);
		System.out.println("Random # 1: "+ num1);
		System.out.println("Random # 2: "+ num2);
		System.out.println("Random # 3: "+ num3);
		System.out.println("Random # 4: "+ num4);
		System.out.println("Random # 5: "+ num5+"\n");
		System.out.println("Sum = "+ sum);
		System.out.println("Average = "+ average);











	}
}