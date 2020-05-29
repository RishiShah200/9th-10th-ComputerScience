public class OddGrouping implements Oddsum{

	private int [] arr;

	public OddGrouping(int []arr){
		this.arr = arr;
	}

	public int sum(){
		int sum = 0;
		for(int x = 0;x<arr.length;x++){
			if(arr[x]%2==1)
				sum+=arr[x];
		}
		return sum;
	}

	public int[] getArr(){
		return arr;
	}

}