public class ExtraCredit2{
	public static void main(String[]args){
		int y = (int)100;
		int i = 1;
		double num = 1;
		double initialguess = y/2;
		System.out.println("Value to estimate square root: "+y);
		System.out.println("Initial Guess: "+(int)initialguess);
		double step = (0.5) * (((double)y/(double)num)+ num);
		num++;
		step = (0.5) * (((double)y/(double)num)+ num);
		System.out.println("Step 1 :"+(double)step);
		num++;
		step = (0.5) * (((double)y/(double)num)+ num);
		System.out.println("Step 2 :"+step);
		num++;
		step = (0.5) * (((double)y/(double)num)+ num);
		num++;
		System.out.println("Step 3 :"+step);
		step = (0.5) * (((double)y/(double)num)+ num);
		num++;
		System.out.println("Step 4 :"+step);
		step = (0.5) * (((double)y/(double)num)+ num);
		num++;
		System.out.println("Step 5 :"+step);
		step = (0.5) * (((double)y/(double)num)+ num);
		num++;
		System.out.println("Step 6 :"+step);
		step = (0.5) * (((double)y/(double)num)+ num);
		num++;
		System.out.println("Step 7 :"+step);
		step = (0.5) * (((double)y/(double)num)+ num);
		num++;







	}
}