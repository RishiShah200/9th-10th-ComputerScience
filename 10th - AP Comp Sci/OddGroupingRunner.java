public class OddGroupingRunner{

	public static void main(String[]args){
		int[] arr = {1,2,3,4};
		OddGrouping oddgroup = new OddGrouping(arr);
		System.out.println(oddgroup.sum());
	}
}
