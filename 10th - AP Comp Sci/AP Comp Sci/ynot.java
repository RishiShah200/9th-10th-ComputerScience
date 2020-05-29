import java.util.ArrayList;
public class ynot{

	public ynot(){
		Program1();
	}
	public static void Program1(){
		ArrayList <Integer> list = new ArrayList <Integer>();
		for(int x = 0;x<20;x++){
			list.add((int)(Math.random()*20)+1);
		}
		System.out.print(list);
		System.out.println();
		for(int x = 0;x<10;x++){
			list.add(list.get(x)+200);
		}
		System.out.print(list);
		System.out.println();
		for(int x = 0;x<list.size();x++){
			list.set(x,list.get(x%7));
		}
		System.out.print(list);
		for(int x = list.size()-1;x>=0;x--){
			if(x%2==1)
				list.remove(x);
		}
		System.out.println();
		System.out.print(list);
		list.add(list.remove(0));
		System.out.println();
		System.out.print(list);
	}
	public static void main(String[]args){

	ynot app = new ynot();

	}

}
