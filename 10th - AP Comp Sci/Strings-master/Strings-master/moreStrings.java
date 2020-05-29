import java.util.ArrayList;
public class moreStrings{

	public moreStrings(){
		String st = "The quick brown fox jumped over the lazy dog";
		System.out.println(Strings(st));
		System.out.println(Strings2(st));
		System.out.println(Strings3(st));
		System.out.println(String4(st));
	}
	public String Strings(String st){
		String temp = "";
 		for(int x = 0;x<st.length();x++){
			temp += st.charAt(st.length()-x-1);
		}
			return temp;
		}
	public String Strings2(String st){
		String temp = "";
		for(int x = st.length()-1;x>=0;x--){
			temp += st.substring(x,x+1);
		}
		return temp;
	}
	public String Strings3(String st){
		String temp = "";
		for(int x = 0;x<st.length();x++){
			if(st.charAt(x) == 'a' || st.charAt(x) == 'e' || st.charAt(x) == 'i' || st.charAt(x) == 'o' || st.charAt(x) == 'u'){
				int rand = (int)(Math.random()*42)+80;
				temp+=(char)rand;
			}
			else
				temp+=st.charAt(x);
			}
			return temp;
		}
	public String String4(String st){
		String temp = "";
		String st2 = st;
		ArrayList<String> list = new ArrayList<String>();
		while(st2.indexOf(" ")>=0){
			list.add(st2.substring(0,st2.indexOf(" ")));
			st2 = st2.substring(st2.indexOf(" ")+1);
		}
		list.add(st2);
		for(int i = 0;i<list.size();i++){
			list.set(i,list.get(i).substring(1, list.get(i).length()-1));
		}
		for(int i = 0;i<list.size();i++)
			temp+=list.get(i)+" ";
		return temp;
	}
	public static void main(String[]args){

		moreStrings app = new moreStrings();

	}
}