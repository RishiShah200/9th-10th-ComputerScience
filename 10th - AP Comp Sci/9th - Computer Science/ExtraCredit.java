public class ExtraCredit{
	public static void main (String[]args){
		int value = (int)(Math.random()*256)+45;
		int step = 1;
		double num = 2;
		double guessinitial = value/2;
		System.out.println("Value to estimate square root: "+value);
		System.out.println("Initial Guess: "+(int)guessinitial);
		while(step<8){
			double guess = (0.5) * (((double)value/(double)num)+ num);
			num = guess;
			System.out.println("Step " +step+": "+guess);
			step++;
}
		double guess = (0.5) * (((double)value/(double)num)+ num);
		System.out.println("");
		System.out.println("Best estimate after 7 iterations: "+(double)guess);

	}
}
