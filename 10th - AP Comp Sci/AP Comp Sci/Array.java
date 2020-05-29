public class Array{

	int[] arr = new int[40];

	public Array(){
		Program1();
		System.out.println("\n");
		Program2();
		System.out.println("\n");
		Program3();
		System.out.println("\n");
		Program4();
		System.out.println("\n");
		Program5();
		System.out.println("\n");
		Program6();
		System.out.println("\n");
		Program7();


	}



	public void Program1(){


		for(int i = 0;i<arr.length;i++){
			int x = (int)(Math.random()*51)+1;
			arr[i] = x;
			System.out.print(arr[i]+"\t");
			if(i%8==7)
				System.out.println();
		}
	}
	public void Program2(){
		for(int y = 0;y<arr.length;y++){
			if(arr[y]%2==0)
				arr[y] = arr[y]-2;
			System.out.print(arr[y]+"\t");
			if(y%8==7)
				System.out.println();
		}
	}
	public void Program3(){
		for(int p = 0;p<arr.length;p++){
			if(p%2==1)
				arr[p] = arr[p]+5;
			System.out.print(arr[p]+"\t");
			if(p%8==7)
				System.out.println();
		}
	}
	public void Program4(){
		for(int p = 0;p<arr.length;p++){
			if(p%2==0&&p%3==1)
				arr[p] = 8;
			System.out.print(arr[p]+"\t");
			if(p%8==7)
				System.out.println();
		}
	}
	public void Program5(){
		for(int p = 0;p<arr.length;p++){
			if(p%2==1&&arr[p]%4==3)
				arr[p] = 400;
			System.out.print(arr[p]+"\t");
			if(p%8==7)
				System.out.println();
		}
	}
	public void Program6(){
		int cnt = 0;
		for(int p = 0;p<arr.length;p++){
			if(arr[p]%2==0){
				cnt++;
			if(cnt%2==0)
				arr[p] = 500;
			}
			System.out.print(arr[p]+"\t");
			if(p%8==7)
				System.out.println();
		}
	}
	public void Program7(){
		int cnt2 = 0;
		for(int m = 0;m<arr.length;m++){
			if(m%5==0){
				cnt2++;
				if(cnt2%2==0)
					arr[m] = 8;
				if(cnt2%2==1)
					arr[m] = 7;
			}
			System.out.print(arr[m]+"\t");
			if(m%8==7)
				System.out.println();
		}
	}
	public static void main(String[]args){

	Array app = new Array();
	}
}