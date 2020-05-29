import java.util.ArrayList;
public class moretestprep{

	public moretestprep(){
		System.out.println(list("hello world another person mom "));

	}
public ArrayList<String> list (String str){
	ArrayList<String> list = new ArrayList<>();

	while(str.indexOf(" ")>=0){
		list.add(str.substring(0,str.indexOf(" ")));
		str = str.substring(str.indexOf(" ") + 1);
	}

	list.add(str);
	return list;

}

public static void main(String[]args){

moretestprep app = new moretestprep();

}

}