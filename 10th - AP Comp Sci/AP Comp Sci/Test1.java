import java.util.ArrayList;
public class Test1{		//Rishi Shah

	public Test1(){
		Program1();
	}
		public void Program1(){
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int x = 0;x<8;x++){
				int y = (x%4)*x+x;
				list.add(y);
			}
			for(int x = 0;x<list.size();x++){
				if(list.get(x)%2==0)
					list.set(x,list.remove(x%4));
				}
				System.out.println(list);
	}
	public static void main(String[]args){

	Test1 app = new Test1();

	}

}