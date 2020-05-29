public class Physics1{
	public static void main (String[]args){
		int t = 5;
		int b = 200;

		System.out.println(Height(t,b));
		System.out.println(Velocity(t,b));
		System.out.println((double)Average(t,b));



	}
		public static double Height (int t, int b){
			double h = ((-4.9)*(t)*(t))+b;
			return h;
}
		public static double Velocity (int t, int b){
			int V = 200;
			double v = V-(9.8)*(t);
			return v;
}
		public static double Average (double t, double b){
			double x2 = 400;
			double x1 = 2;
			double bb = 20;
			double a = 4;
			double ave = (x2-x1)/(bb-a);
			return ave;
}
}