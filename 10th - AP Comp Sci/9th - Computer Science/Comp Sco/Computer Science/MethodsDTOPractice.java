public class MethodsDTOPractice {

	public static void message1() {
		System.out.println("message 1");
	}

	for (x>8) then (y<7){


	public static void message3() {
		message2();
		System.out.println("message 3");
		message1();
	}

	public static int doubleMe(int a) {
		return 2*a;
	}

	public static int cubeMe(int a) {
		return a*a*a;
	}

	public static void countToThree(String a) {
		System.out.println(1+a);
		System.out.println(2+a);
		System.out.println(3+a);
	}

	public static double avgOfFour(int a, int b, int c, int d) {
		return (a+b+c+d)/4.0;
	}

	public static void main(String[] args) {
		message3();
		System.out.println(cubeMe(doubleMe(3)));
		countToThree("Mississippi");
		System.out.println(avgOfFour(1,2,3,4));
	}
}
