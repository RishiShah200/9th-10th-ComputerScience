public class FinalTestReview{

	public FinalTestReview(){
		Program1();
	}
	public void Program1(){
		int k = 0;
		for(int x = 0;x<=5;x++){
			for(int y = 5;y>x;y--){
				k=y;
				System.out.print(y);
			}
			if(k%2==0)
			System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[]args){

		FinalTestReview app = new FinalTestReview();

	}

}