public class PracticeTypesOfInt{
	public static void main (String[]args){
	int i = 2;
	int j = 11;
	double k = 4.1;
	double m =6;
	System.out.println(j);
	System.out.println(k+m);
	System.out.println(k+j);
	///////////The double overrides the int operation
	System.out.println(j%i);
	System.out.println((double)i+j);
	System.out.println((int)(6.7));
	////Will not round only drops the decimal
	System.out.println(j/1);
	System.out.println((double)j/i);
	System.out.println(j/(double)i);
	System.out.println((double)(j/i));
	i = j - 3;
	System.out.println(i);
	k = i + 3;
	System.out.println(k);
	double sum = k+i;
	double avg = sum/2;







	}

}