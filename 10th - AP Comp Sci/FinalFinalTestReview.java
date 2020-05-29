public class FinalFinalTestReview{

	public FinalFinalTestReview(){
		Program1();
	}
	public void Program1(){
		for(int x = 0;x<5;x++){
			for(int y = 5;y>x;y--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[]args){

	FinalFinalTestReview app = new FinalFinalTestReview();

	}
}