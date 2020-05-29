import java.util.Scanner;
	public class StringMethodsReview2{
		public static void main(String[]args){
	Scanner reader = new Scanner (System.in);
	int cnt = 0;
	int total = 0;
	String name = "Rishi Shah and i like computer science";
	for(int i = 0;i<name.length();i++){
		if(name.charAt(i)==' ')
			cnt++;
		else if(name.charAt(i)!=' ')
			total++;
	}
	System.out.println(total/cnt-1);






	}
}