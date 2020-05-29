public class RandomNumbers2{
	public static void main (String[]args){
	int num = (int)(Math.random()*20+1);
	int num2 = (int)(Math.random()*14+5);
	int num3 = (int)(Math.random()*179+37);
	int sum = (num+num2+num3);
	double avg = (sum/3);
	int ghgh = (num/num2);
	int remainder = (num3%num);
	System.out.println("First num:"+num);
	System.out.println("Second num:"+num2);
	System.out.println("Third num:"+num3);
	System.out.println("Average of nums:"+sum);
	System.out.println("Sum of nums:"+avg);
	System.out.println(ghgh);
	System.out.println(remainder);



	}
}