public class DArrays2{
	public static void main (String[]args){
	/*
	int[][]table = new int[3][5];
	int i = 0;
	int sum = 0;
	int max = Integer.MIN_VALUE;
	for(int row = 0;row < table.length;row++){
		for(int col = 0;col<table[row].length;col++){
			int rand = (int)(Math.random()*50)+1;
			sum+=rand;
			if(rand>max)
			max = rand;
			table[row][col] = rand;
			System.out.print(table[row][col]+"\t");
		}
		System.out.println();
	}
	System.out.println("The sum is "+sum+" the max is "+max);

	}
	}
	*/
	int[][] table = new int[10][10];
	int i = 0;
	for(int row = 0; row < table.length; row++){
		for(int col = 0; col < table[row].length; col++){
			i++;
			table[row][col] = i;
			System.out.print(table[row][col]+"\t");
		}
		i=0;
		System.out.println();

	}


		}
}
