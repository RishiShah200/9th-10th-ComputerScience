import java.util.Scanner;
	public class WhileLoops3{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
int x = 1;
int y = 10;
int a = 0;
	do{
		if(x%2==0)
		y  =(y/(x+1));
		else
		y+=x;

		x++;
		a++;
	}
	while(y!=0);
	System.out.println(a);


}
}