public class NewTest{

	public NewTest(){
		Program1();
	}
	public void Program1(){
		int k = 0;
		for(int x = 1;x<5;x++){
			for(int y = 5;y>x;y--){
				System.out.print(y);
				k=y;
			}
			if(k%2==0)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void main(String[]args){

	NewTest app =  new NewTest();
	}
}



