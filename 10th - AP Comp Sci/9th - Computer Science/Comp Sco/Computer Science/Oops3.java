public class Oops3{
	public static void main (String[]args){
		double bubble = 867.5309;
		double x = 10.01;
		double y = 8.0;

		System.out.println(printer(x,y));
		System.out.println(printer(x,bubble));
		System.out.println(printer(x,bubble));
			int z = 5;
		System.out.println("z= " + z);
}
		public static String printer2(double x, double y){
		String a = "x =" + x + " and y = " + y;
		return a;

}
		public static String printer(double x, double y){
			String b = "The value from main is:" + y;
			return b;
}
}
