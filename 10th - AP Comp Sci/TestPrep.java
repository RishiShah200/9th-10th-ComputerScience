public class TestPrep{

	public TestPrep(){

	System.out.println(recur("aeiou"));
	}
public String recur(String str){
	if(str.length()==0)
		return "";
	if(str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u')
		return recur(str.substring(1));
	return "" + str.charAt(0) + recur(str.substring(1));

	}

public static void main(String[]args){

TestPrep app = new TestPrep();

}

}