public class sumOfDigits{

	public sumOfDigits(){
		System.out.println(Program1(1235));
	}

	public static int Program1(int x){
		if(x==0)
			return 0;
        return (x % 10 + Program1(x/10));
}
	public static void main(String[]args){

	sumOfDigits app = new sumOfDigits();

	}

}