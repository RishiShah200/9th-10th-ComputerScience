import java.util.Scanner;
	public class SelectionSortReviewQuiz{
		public static void main (String[]args){

	int [] arr = {5,4,3,2,1};

for(int i = 1;i<arr.length;i++){
	int j = i;
	while(j>0&&arr[j]<arr[j-1]){
		int temp = arr[j];
		arr[j] = arr[j-1];
		arr[j-1] = temp;
		j--;
	}
}
for(int k = 0;k<arr.length;k++)
System.out.print(arr[k]+" ");
	}
	}