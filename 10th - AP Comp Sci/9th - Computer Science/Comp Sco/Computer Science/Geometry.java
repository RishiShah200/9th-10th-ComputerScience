public class Geometry{
	public static void main (String[]args){
		double a = 5.657;
		double b = 6.234;
		System.out.println(Rect1(a,b));
		System.out.println(Peri1(a,b));
		System.out.println(Tri1(a,b));
		System.out.println(Circum1(a,b));
		System.out.println(Circum2(a,b));


	}
		public static double Rect1(double a, double b){
			double Rect = a*b;
			double Rect1 = (double)Math.round(Rect*100)/100;
			return Rect1;
}
	public static double Peri1(double a, double b){
			double Peri = (2*a)+(2*b);
			double Peri1 = (double)Math.round(Peri*100)/100;
			return Peri1;
}
	public static double Tri1(double a, double b){
			double Tri = (0.5)*(a*b);
			double Tri1 = (double)Math.round(Tri*100)/100;
			return Tri1;
}
		public static double Circum1(double a, double b){
			double Circum = (Math.PI)*(b);
			double Circum1 = (double)Math.round(Circum*100)/100;
			return Circum1;
}
		public static double Circum2 (double a, double b){
			double Circum = (2)*(Math.PI)*(b);
			double Circum2 = (double)Math.round(Circum*100)/100;
			return Circum2;
}
}