public class ArraysQuiz{
		public static void main (String[]args){
	int[] a = new int [20];
	int sum = 0;
	double avg = 0;
	int count = 0;
	int f = Integer.MAX_VALUE;
	 for(int i = 0;i<a.length;i++){
		 a[i] = (int)(Math.random()*41)+13;
		 sum+=a[i];
		 avg = (double)sum/20;
		 count++;
		 System.out.print(a[i]+" ");
		 if(count==5||count==10||count==15||count==20)
		 	System.out.println();
		 if(a[i]<f)
		 	f = a[i];
									}
		System.out.println();
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
		System.out.println("Min: "+f);
	 }
}