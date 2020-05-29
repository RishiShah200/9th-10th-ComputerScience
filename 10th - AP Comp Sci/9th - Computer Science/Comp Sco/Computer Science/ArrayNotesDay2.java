public class ArrayNotesDay2{
	public static void main (String[]args){
		int[]n = {1,2,3,4,5};
	for(int i = 0;i<n.length;i++)
		System.out.print(n[i] +" ");

	int temp = n[0];
	n[0] = n[4];
	n[4] = temp;
	for(int x = 0;x<n.length;x++)
		System.out.print(n[x] +" ");





	}
	}