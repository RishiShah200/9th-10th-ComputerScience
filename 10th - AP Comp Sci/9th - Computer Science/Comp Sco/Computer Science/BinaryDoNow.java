import java.util.Scanner;
	public class BinaryDoNow{
		public static void main (String[]args){

		int [] arr = new int [100];
		for(int j = 0;j<arr.length;j++){
		int num = (int)(Math.random()*1000)+1;
		arr[j] = num;
		}
		for(int i = 0;i<arr.length;i++){
		if(arr[i]==100)
			System.out.println("The array has the number 100 in it!");
		}

		}
		}