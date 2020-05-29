import java.util.Scanner;
	public class InitialsProgram2{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);

int x = 1;
int y  =0;
for(int i = 8;i>0;i--){
x+=y;
y++;
}
System.out.println(x);

}
}