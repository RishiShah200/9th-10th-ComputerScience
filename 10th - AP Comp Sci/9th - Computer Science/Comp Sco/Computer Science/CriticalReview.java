public class CriticalReview{
	public static void main (String[]args){
		int[] a = new int [10];
		int x = Integer.MIN_VALUE;
		for(int i = 0;i<a.length;i++){
		a[i] = (int)(Math.random()*8)+3;
		if(a[i]>x)
		x = a[i];
										}
		System.out.print(x+" ");
		System.out.println();
		for(int b = 300;b<=500;b++){
			if(b%2==0&&b%11==0)
				System.out.print(b+" ");
									}
		System.out.println();
		int n = 3;
		int v = 5;
		int temp = 5;
		v = n;
		n = temp;
		System.out.print(n+" "+v);




	}
	}