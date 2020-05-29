public class DoNow{

	public DoNow(){
		array();
	}

	public void array(){
		int [] arr = new int [30];
		double cnt = 0;
		int min = 48;
		int max = 0;
		double finalsum = 0;
		int range = 0;
		for(int b = 0;b<30;b++){
			arr[b] = (int)(Math.random()*42)+7;
			cnt+=arr[b];
			if(b==10||b==20)
				System.out.println();
			System.out.print(arr[b]+"\t");
			if(arr[b]<min)
				min = arr[b];
			if(arr[b]>max)
				max = arr[b];

		 }
		 	finalsum = cnt/30.0;
		 	System.out.println();
		 	System.out.println();
			System.out.print("Mean: "+((double)Math.round(finalsum*100)/100)+"\n");
			System.out.print("Range: "+(max-min));
	}
	public static void main(String[]args){

	DoNow app = new DoNow();
	}

}