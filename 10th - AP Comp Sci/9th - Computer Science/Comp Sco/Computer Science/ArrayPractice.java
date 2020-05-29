public class ArrayPractice{
	public static void main (String[]args){
		System.out.println("Problem 1");
		int [] array = new int [30];
		for(int i = 0;i<array.length;i++){
			array[i] = (int)(Math.random()*31)+5;
			System.out.print(array[i]+" ");
											}
			System.out.println();
		System.out.println("Program 2");
		for(int i = 0;i<array.length;i++){
			if(array[i]%2==0)
				array[i] = array[i]*3;
			System.out.print(array[i]+" ");
										}
		System.out.println();
		System.out.println("Program 3");
		for(int i = 0;i<array.length;i++){
			if(i%2==1)
				array[i] = array[i-1];
			System.out.print(array[i]+" ");
											}
		System.out.println();
		System.out.println("Program 4");
		int minvalue = Integer.MIN_VALUE;
		for(int i = 0;i<array.length;i++){
		if(array[i]>minvalue)
		minvalue = array[i];
											}
		System.out.print("The largest value is "+minvalue);
		System.out.println();
		System.out.print

	}
	}