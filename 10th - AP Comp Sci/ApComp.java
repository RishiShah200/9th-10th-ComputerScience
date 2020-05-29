import java.lang.Math;
public class ApComp{	//<--program header

	public ApComp(){		//<--Constructor for the class
		program1();
		System.out.println();
		program2();
		System.out.println();
		program3();
		System.out.println();
		program4();
		System.out.println();
		program5();
		System.out.println();
		Program8();
		System.out.println();
		Program9(15);
		System.out.println();
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
	public void Program8(){
		int y = 1;
		int p = 1;
		int cnt = 22;
		int cnt2 = 0;
		for(int i = 2;i<cnt;i++){
			int h = y+p;
			if(cnt2==5||cnt2==10||cnt2==15||cnt2==20)
				System.out.println();
			System.out.print(h+" ");
			cnt2++;
			y=p;
			p=h;
		}
		System.out.println();

	}
	public void Program9(int n){
		for(int i=1; i<=n;i++){
		System.out.print("[" + i + "] ");
		}
	}
	public static void main (String[]args){		//main ution section

		ApComp app = new ApComp();		//<--instantiating my class
	}
}