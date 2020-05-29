public class stringStuff{

	public stringStuff(){
		String st = "TikTok";
		String st2 = new String ("TikTok");


System.out.println(st.compareTo(st2));		//subtract ascii values of each character st-stt

		System.out.println(st+" "+st2);
		for(int x = 0;x<st.length();x++)
			System.out.println((char)(st.charAt(x)+3));
		System.out.println((char)7);
		System.out.println(st.indexOf("k"));
		System.out.println((int)st.charAt(1));


/*

		while(st.indexOf("k")>=0){
			st=st.substring(0,st.indexOf("k"))+st.substring(st.indexOf("k")+1);
		}
		System.out.println(st);
*/

		//System.out.println(st==st2);Taking up the same slot in the computer, if yes then true else false
		//System.out.println(equalCheck(st,st2));
	}

	public boolean equalCheck(String st, String st2){		//efficiency Best 0:(1)
		if(st.length()!=st2.length())													// Worst: 0(n)
			return false;
		for(int x = 0;x<st.length();x++){
			if(st.charAt(x)!=(st2.charAt(x)))		//Character is a primitive data type
				return false;
		}
		return true;
	}



	public static void main(String[]args){

		stringStuff app = new stringStuff();

	}

}