import java.util.Scanner;
	public class NestedLoops{
		public static void main (String[]args){
			int x = 0;
	for(int i = 0;i<5;i++){
		for(int j=0;j<i;j++)
			System.out.print("*");
				System.out.println();
}
System.out.println();
	for(int i = 0;i<5;i++){
		for(int t = i;t<4;t++)
			System.out.print("*");
		System.out.println();
}
System.out.println();
	for(int i = 6;i>0;i--){
		if(i%2==0){
			for(int j = i;j>0;j--)
				System.out.print("*");
				System.out.println();
}
		else
		x = 2;
	}

}
}