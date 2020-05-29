import java.util.Scanner;

public class BinaryProgram5{
	public static void main (String[]args){
		Scanner reader = new Scanner (System.in);
		int [] arr = new int [10];
		int enter = 1;
		boolean done = false;
		int key = 0;
		int cnt = 0;
		int middle = Integer.MAX_VALUE;
		while(enter==1){
		for(int k = 0;k<arr.length;k++)
			arr[k] = (int)(Math.random()*100)+1;

		for(int i = 0;i<arr.length -1;i++){
				int Minindex = i;
				for(int j = i+1;j<arr.length;j++){
					if(arr[j]<arr[Minindex])
						Minindex = j;
				}
				int temp = arr[i];
				arr[i] = arr[Minindex];
				arr[Minindex] = temp;
		}


		for(int b = 0; b<arr.length;b++)
		System.out.print(arr[b]+" ");
		int low = 0;
		int high  = arr.length-1;
		System.out.println();

			System.out.println("Enter the number you want to guess");
			key = reader.nextInt();

			while(high >= low) {
				middle = (low + high) / 2;
				if(arr[middle] == key) {
					cnt++;
					break;
				}
				else if(arr[middle] < key) {
					low = middle + 1;
				}
				else if(arr[middle] > key) {
					high = middle - 1;
				}
			}

			System.out.println(arr[middle] == key ? "Your number is in the array." : "Your number is not in the array.");
			System.out.println("If you would like to play again enter the number 1 else enter a different number");
			enter = reader.nextInt();
			if(enter!=1)
				System.out.println("This is your total score "+cnt);
}





	}
}