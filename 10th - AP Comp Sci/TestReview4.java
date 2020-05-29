
public class TestReview4
{
	public TestReview4()
	{
		String sent="The five boxing wizards jump quickly";
	//	System.out.println(sent);
		System.out.println(recur(sent));
		//This is an alternate solution
		//System.out.println(recur2(sent));
	}
	public String recur(String s)
	{
		if(s.length()<=0)
			return "";
		if(s.toUpperCase().charAt(0)=='D'
					|| s.toUpperCase().charAt(0)=='T')
			return ""+s.charAt(0)+s.charAt(0)+recur(s.substring(1));

	    return "" + recur(s.substring(0,1));
	}
	public static String recurNoUpperCaseUse(String s)
	{
		if(s.length()<=0)
			return "";
		if(s.charAt(0)=='D' || s.charAt(0)=='d'
					|| s.charAt(0)=='T' || s.charAt(0)=='t')
			return ""+s.charAt(0)+s.charAt(0)+recurNoUpperCaseUse(s.substring(1));

	    return ""+s.charAt(0)+recurNoUpperCaseUse(s.substring(1));

	}



	//This is an alternate solution!!!!
	public String recur2(String s)
	{
		if(s.length()<=0)
			return "";
		if(s.toUpperCase().substring(0,1).equals("D")
							|| s.toUpperCase().substring(0,1).equals("T"))
			return s.substring(0,1)+s.substring(0,1)+recur(s.substring(1));

	    return s.substring(0,1)+recur(s.substring(1));
	}

	public String recur2NoUpperCaseUse(String s)
	{
		if(s.length()<=0)
			return "";
		if(s.substring(0,1).equals("D") || s.substring(0,1).equals("d")
				|| s.substring(0,1).equals("T") || s.substring(0,1).equals("t"))
			return s.substring(0,1)+s.substring(0,1)+recur2NoUpperCaseUse(s.substring(1));

		return s.substring(0,1)+recur2NoUpperCaseUse(s.substring(1));
	}


	public static void main(String args[])
	{
		TestReview4 app=new TestReview4();
	}
}