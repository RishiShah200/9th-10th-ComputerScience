import java.util.Scanner;
	public class BinaryProgram3{
		public static void main (String[]args){


int[] arr = new int [1000];
		int lo = 0;
		int hi = arr.length-1;

		boolean yes = false;
		int Minindex = 0;
		int counter = 0;
		int counter2 = 0;
		int tbin = 0;
		int treg = 0;
		boolean idk = false;
		for(int num = 1; num<100;num++){
			int key = (int)(Math.random()*10000)+1;
		for(int k = 0;k<arr.length;k++){
		arr[k] = (int)(Math.random()*10000)+1;
		}
		boolean check1 = false;
		for(int s = 0;s<arr.length;s++){
			if(arr[s] == key){
				check1 = true;
				break;
			}
			counter2++;
		}
		for(int i = 1; i < arr.length; i++){
			int j = i;
			while(j > 0 && arr[j] < arr[j-1]){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}

		}
		boolean done = false;
		int size = arr.length;
		int low = 0;
		int high  = size-1;
		counter=0;
		while(high >= low && done == false){
			int middle = (low+high) / 2;
			(arr[middle] == key){
				done = true;
				break;
			}
			if(arr[middle] < key){
				low = middle + 1;
			}
			if(arr[middle] > key){
				high  = middle - 1;
			}
			counter++;
		}
		tbin+=counter;
		treg+=counter2;

}
		System.out.println("The average number of regular searches is "+((double)treg/100)+" and the average number of binary searches is "+((double)tbin/100));
}
}

