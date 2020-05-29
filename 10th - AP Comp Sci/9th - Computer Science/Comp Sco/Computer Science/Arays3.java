public class Arays3{
	public static void main (String[]args){
		System.out.println("Program 3");
		int x = -5000;
		int j = 5000;
		int sum = 0;
		int[] array = new int [5];
	for(int y = 0;y<array.length;y++){
		array[y] = (int)(Math.random()*100)+1;
		if(array[y]>x)
			x = array[y];
		if(array[y]<j)
			j = array[y];
		System.out.print("\n"+array[y]+" ");
		sum+= array[y];
										}
		System.out.print("\nThe sum of the numbers is "+sum+"\nThe greatest number is "+x+"\nThe least number is "+j);



	}
	}