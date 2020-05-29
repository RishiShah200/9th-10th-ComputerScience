import java.util.ArrayList;
public class Sets{
ArrayList<Integer> list = new ArrayList<Integer>();
ArrayList<Integer> list2 = new ArrayList<Integer>();
	public Sets(){
		for(int x = 2;x<11;x++){
				if(x==2||x==5||x==7||x==10)
					list.add(x);
			}
		for(int x = 1;x<10;x++){
			if(x%2==1)
				list2.add(x);
		}
		System.out.println("List 1: "+list);
		System.out.println("List 2: "+list2);
		System.out.println("Union: "+union(list, list2));
		System.out.println("Intersection: "+intersection(list,list2));
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		ArrayList<Integer> tempList2 = new ArrayList<Integer>();
		ArrayList<Integer> tempList3 = new ArrayList<Integer>();
		ArrayList<Integer> tempList4 = new ArrayList<Integer>();
		tempList.add(5);
		tempList.add(7);
		tempList3.add(1);
		tempList3.add(5);
		tempList3.add(7);
		tempList2.add(null);
		tempList4.add(2);
		tempList4.add(10);
		if(subset(tempList,list)==true)
			System.out.print(tempList+" is a subset of "+list+".\t");
		else
			System.out.print(tempList+"is not a subset of"+list+".\t");
		if(subset(tempList,list2)==true)
			System.out.println(tempList+" is a subset of "+list2+".\t");
		else
			System.out.print(tempList+"is not a subset of"+list2+".\t");
		if(subset(tempList2,list)==true)
			System.out.print(tempList2+" is a subset of "+list+".\t");
		else
			System.out.print(tempList2+"is not a subset of"+list+".\t");
		if(subset(tempList2,list2)==true)
			System.out.println(tempList2+" is a subset of "+list2+".\t");
		else
			System.out.print(tempList2+"is not a subset of"+list2+".\t");
		if(subset(tempList3,list))
			System.out.print(tempList3+"is a subset of "+list+".\t");
		else
			System.out.print(tempList3+"is not a subset of "+list+".\t");
		if(subset(tempList3,list2))
			System.out.println(tempList3+"is a subset of "+list+".\t");
		else
			System.out.println(tempList3+"is not a subset of "+list2+".");
		if(subset(tempList4,list))
			System.out.print(tempList4+"is a subset of "+list+".\t");
		else
			System.out.print(tempList4+"is not s subset of "+list+".\t");
		if(subset(tempList4,list2))
			System.out.print(tempList4+"is a subet of "+list2+".\t");
		else
			System.out.print(tempList4+"is not a subset of "+list2+".\t");
	}
	public static ArrayList<Integer> union(ArrayList<Integer> x, ArrayList<Integer> y){
		ArrayList<Integer> union = new ArrayList<Integer>();
		for(int p = 0;p<x.size();p++){
			union.add(x.get(p));
		}
		for(int l = 0;l<y.size();l++){
			if(!union.contains(y.get(l)))
				union.add(y.get(l));

		}
		return union;
	}
	public static ArrayList<Integer> intersection(ArrayList<Integer> x, ArrayList<Integer> y){
	ArrayList<Integer> intersection = new ArrayList<Integer>();
		for(int m = 0;m<x.size();m++){
			for(int u = 0;u<y.size();u++){
				if(x.get(m)==y.get(u))
					intersection.add(y.get(u));
			}
		}

		return intersection;
	}
	public static boolean subset(ArrayList<Integer> x, ArrayList<Integer> y){
		int counter = 0;
		for(int m = 0;m<x.size();m++){
			for(int u = 0;u<y.size();u++)
				if(x.get(m)==y.get(u))
					counter++;
		}
		if(x.get(0)==null)
			return true;
		if(x.size()==counter)
			return true;
		else
			return false;

	}
	public static void main(String[]args){

		Sets app = new Sets();


	}

}