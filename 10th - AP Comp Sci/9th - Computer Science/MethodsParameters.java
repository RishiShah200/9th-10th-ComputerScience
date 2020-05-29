public class MethodsParameters{
	public static void main (String[]args){
		int Rishi = 20;
		int Mehar = 4;
		int a = 0;
		int b = 1;
		int c =  2;
		int d = 3;
		int e = 4;
		int a2  = 2;
		double a3 = 2;
		System.out.println(quotient(Rishi, Mehar));
		double sum1 = quotient(45, Rishi);
		System.out.println(average(a,b,c,d,e));
		System.out.println(power(a2));
		System.out.println(power2(a3));
}
		public static double quotient(double a, double b){
			double quotient = a/b;
			return quotient;
}
		public static double average(int a, int b, int c, int d, int e){
			double avg = (a+b+c+d+e)/5.0;
			return avg;
}
		public static int power (int a2){
			int power = (a2*a2*a2*a2);
			return power;
}
		public static double power2 (double a3){
			double power = (a3*a3*a3*a3);
			return power;
}
}