import java.lang.Math;
public class ApComp{	//<--program header

	public ApComp(){		//<--Constructor for the class
		program1();
		program2();
		program3();
		program4();
		program5();
		Program6();
	}
	public void program1(){
	int counter = 0;
	int total = 0;
		for(int i = 1;i<=100;i++){
			if(i%2==0){
				counter++;
				total+=i;
			}
		}
	System.out.println("Sum:"+total);
	System.out.println("Avg:"+total/counter);
	}
	public void program2(){
		for(int x = 1;x<=5;x++){
			for(int y = x;y <=5;y++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void program3(){
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
	public void program4(){
		for(int l = 0;l<15;l++){
			for(int x=(int)(Math.random()*15)+1; x<15;x++)
				System.out.print("*");
			System.out.println();
		}
	}
	public void program5(){
		int counter = 0;
		int q = 0;
		String star = "";
		System.out.println("0");
		for(int x = 1;x<6;x+=0){
			System.out.println(x);
			counter++;
				if(counter%2==1)
					star+="*";
					q++;
				if(q==9){
					break;
				}
				System.out.print(star);
				if(counter%2==0)
					x++;


		}

	}
	public void Program6(){
		for(int x = 2;x<20000;x++){
			int y = x;
			System.out.print(y+" ");
			x+=y;
		}
	}
	public static void main (String[]args){		//main ution section

		ApComp app = new ApComp();		//<--instantiating my class
	}
}