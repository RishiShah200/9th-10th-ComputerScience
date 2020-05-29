import java.util.Scanner;
	public class testdocument{
public static void main (String[]args){
int[][] z = new int[5][2];
for (int row = 0; row < z.length; row ++) {
            	for (int col = 0; col < z[row].length; col ++) {
                            	z[row][col] = row+col;
                            	System.out.print(z[row][col]);
            	}
            	System.out.println();
}
}
}