public class Squareroots{
	public static void main(String[]args){
	    int value = (int)(Math.random()*256)+45;
		int step = 1;
		double num = step;
		for(step<8){
			double guessinitial = value/2;
			double guess = (0.5) * (((double)value/(double)step)+ step);
			num = guess;
	}

}
}