public class ArrayDay2Programs{
	public static void main (String[]args){
		System.out.println("Program 1");
					int sum = 0;
						int[] array3 = new int[6];
					for(int j = 0;j<array3.length;j++){
						array3[j] = (int)(Math.random()*20)+1;
						System.out.print(array3[j]+" ");
														}
					System.out.println();
						int temp = array3[3];
						array3[3] = array3[4];
						array3[4] = temp;
						for(int x = 0;x<array3.length;x++)
				System.out.print(array3[x] +" ");
		System.out.println();
			System.out.println("Program 2");
			int[] array4 = new int [10];
			double total = 0;
			double avg = 0;
			for (int i = 0; i < array4.length; i++) {
			            	array4[i] = i+4;
			            	total += array4[i];
			}
			avg = total / array4.length;
			System.out.println("\n"+avg);

			System.out.print("Program 3");
			System.out.println();
			int[] m = {1,2,3,4,5,6,7,8};
			int temp2 = 0;
			for(int i = 0;i<m.length;i++){
				System.out.print(m[i]+" ");
										}
			for(int c = 0;c<4;c++){
				temp2 = m[c];
				m[c] = m[7-c];
				m[7-c]= temp2;
									}
			System.out.print("\n");
			for(int d = 0;d<m.length;d++){
				System.out.print(m[d]+" ");
										}








	}
	}