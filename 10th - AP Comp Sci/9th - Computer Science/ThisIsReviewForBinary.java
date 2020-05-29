public class ThisIsReviewForBinary{
	public static void main (String[]args){
	int [] arr = {5,4,3,2,1};
	int cnt = 0;
	for(int i = 1;i<arr.length;i++){
		int j = i;
			while(j>0 && arr[j]<arr[j-1]){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
	}

		int low = 0;
		int high = arr.length-1;
		int key = 1;
		while(high>=low){
			int middle = (low+high)/2;
			if(arr[middle]==key){
				break;
			}
			if(arr[middle] < key){
				low = middle + 1;
				cnt++;
			}
			if(arr[middle] > key){
				high  = middle - 1;
				cnt++;

			}
		}
		System.out.println(cnt);

	}
	}