public class rounding{
	public static void main (String[]args){
		double pi = Math.PI;
		System.out.println(Round(pi));
		System.out.println(pi);

	}
		public static double Round(double a){
			double value = (double)Math.round(a*100)/100;
			return value;

	}
}