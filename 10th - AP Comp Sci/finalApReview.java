public class finalApReview{


	public finalApReview(){
		int [][] arr = new int [6][6];
		int cnt = 0;
		for(int[] row : arr){
			for(int elem : row){

				//elem = cnt;
				elem = 1;
				cnt++;

			}
		}
		for(int[] row : arr){
			for(int elem : row){
				System.out.print(elem);
			}
			System.out.println();
		}


	}


	public static void main(String[]args){

	finalApReview app = new finalApReview();

	}

}