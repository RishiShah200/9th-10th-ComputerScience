import java.util.Scanner;
	public class BinaryProgram3{
		public static void main (String[]args){


		int[] arr = new int [1000];
		int lo = 0;
		int hi = arr.length-1;

		boolean yes = false;
		int Minindex = 0;
		int cnt = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int rgavg = 0;
		int biavg = 0;
		double avg1 = 0.0;
		double avg2 = 0;
		boolean idk = false;
		while(cnt3!=100){
			int m = (int)(Math.random()*1000)+1;
			int key = m;
			cnt3++;
		for(int k = 0;k<arr.length;k++){
		arr[k] = (int)(Math.random()*1000)+1;
		if(arr[k] == key){
			idk = true;
			System.out.println(key+" is in the array and the computer regular seacrhed "+ cnt+" times\n");
			cnt=0;
			break;
		}
		else{
			cnt++;
		}

}
		if(idk==false)
			System.out.println(key+" is not in the array and the computer regular seacrhed "+cnt+" times\n");
			cnt=0;
		for(int i = 1; i < arr.length; i++){
			int j = i;
			while(j > 0 && arr[j] < arr[j-1]){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}

		}
		while(lo <= hi){
			int mid = (lo+hi)/2;
			if(arr[mid] == key){
				yes = true;
				break;
			}
			else if(arr[mid] < key){
				lo = mid + 1;
				cnt2++;
			}
			else if(arr[mid] > key){
				hi = mid - 1;
				cnt2++;
			}
		}
		if(yes == true){
			System.out.println(key+" is in the array and the computer binary searched "+cnt2+" times\n");
		}
		else
			System.out.println(key+" is NOT in the array and the computer binary searched "+cnt2+" times\n");


}

}
}

