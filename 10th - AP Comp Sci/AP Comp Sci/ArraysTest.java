public class ArraysTest{	 //Rishi Shah
	int[] arr = new int [18];
	int[] arr2 = new int [12];
	int min = 100000;
	int max = 0;
	int sum = 0;

	public ArraysTest(){
		  Program1();
		  System.out.println("\n");
		  Program2();
	}
	public void Program1(){
		for(int x = 0;x<arr.length;x++){
			arr[x] = (int)(Math.random()*34)+11;
		}
		for(int x = 0;x<arr.length;x++){
			if(arr[x]<min)
				min = arr[x];
		}
		for(int x = 0;x<arr.length;x++){
			if(arr[x]>max)
				max = arr[x];
		}
		System.out.print("Minimum Value: "+min+" Maximum Value: "+max);
	}
	public void Program2(){
		for(int x = 1;x<12;x++){
			arr2[x] = x;
			arr2[0] = 12;
		}
		for(int x = 1;x<(arr2.length/2);x++){
			int temp = arr2[x];
			arr2[x] = arr2[(arr2.length)-x];
			arr2[(arr2.length)-x] = temp;
		}
		for(int x = 0;x<arr2.length;x++){
			  sum+=arr2[x];
		}
		double avg = (double)sum/12;
		System.out.print("Sum: "+sum+" Average: "+avg);

	}
	public static void main(String[]args){

	ArraysTest app = new ArraysTest();

	}

}