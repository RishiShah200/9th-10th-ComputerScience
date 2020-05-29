public class MethodsParameters2{
	public static void main (String[]args){
		int Rishi = 20;
		int Mehar = 4;
		int Zareeb = 5;
		int Akash = 0;
		int Arnav = 8;
		System.out.println(numberAdder(Rishi, Mehar));
		double sum1 = numberAdder(45, Rishi);
}
		public static double numberAdder(double a, double b, double c, double d, double e){
			double average = (a+b+c+d+e)/5;
			return average;
}
}