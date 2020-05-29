public class ArraysTestReview{
	int [] arr = new int [20];

	public ArraysTestReview(){
		Program1();
	}
	public void Program1(){
		for(int x = 0;x<arr.length;x++){
			arr[x] = (int)(Math.random()*20)+1;
			System.out.print(arr[x]+" ");
		}
		for(int x = 0;x<arr.length/2;x++){
			int temp = arr[x];
			arr[x] = arr[(arr.length-1)-x];
			arr[(arr.length-1)-x] = temp;
		}
		System.out.println("\n");
		for(int x = 0;x<arr.length;x++){
			System.out.print(arr[x]+" ");
		}
		System.out.println("\n");
		for(int x = 0;x<arr.length;x++){
			if(x%2==0)
				arr[x] = 5;
			System.out.print(arr[x]+" ");
		}
		System.out.println("\n");
		for(int x = 0;x<arr.length;x++){
			if(x!=0){
			int temp = arr[x];
			arr[x] = arr[x-1];
			arr[x-1] = temp;
			System.out.print(temp+" ");
			}

		}
	}
	public static void main(String[]args){

	ArraysTestReview app = new ArraysTestReview();

	}

}