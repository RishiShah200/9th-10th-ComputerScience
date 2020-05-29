public class AverageValues{
	public static void main (String[]args){
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		System.out.println(numSum1(a,b));
		System.out.println(numSum2(a,b,c));
		System.out.println(numSum3(a,b,c,d));
		System.out.println(numQuot(a,b));
		System.out.println((double)Average(a,b,c,d));




	}
		public static int numSum1 (int a, int b){
			int numSum1 = a+b;
			return numSum1;
}
		public static int numSum2 (int a, int b, int c){
			int numSum2 = c+b+a;
			return numSum2;
}
		public static int numSum3 (int a, int b, int c, int d){
			int numSum3 = c+b+a+d;
			return numSum3;
}
		public static double numQuot (int a, double b){
			double numQuot = (b/a);
			return numQuot;
}
		public static double Average (double a, double b, double c, double d){
			double Average = a+b+c+d;
			return Average;
}
}