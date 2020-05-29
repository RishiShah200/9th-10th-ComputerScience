public class Rohan{

	public Rohan(){
		Program1();
	}
	public void Program1(){
		System.out.println(method(1));
	}
	public int method(int x){
		if(x>5)
			return 1;
		return x+method(x+1)+method(x+2);

	}
	public static void main(String[]args){

	Rohan app = new Rohan();

	}

	}