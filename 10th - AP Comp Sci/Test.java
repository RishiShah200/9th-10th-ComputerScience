public class Test{

	public Test(){
		Program1();
	}

	public void Program1(){
		int x = 0;
		while(x==0)
			System.out.print("Infinite Loop");
	}
	public static void main (String[]args){
		Test app = new Test();
	}

}