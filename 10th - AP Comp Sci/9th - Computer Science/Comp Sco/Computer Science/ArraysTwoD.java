public class ArraysTwoD{
	public static void main (String[]args){


int[][]table = new int[4][6];
	int i = 0;
	int sum = 0;
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	for(int row = 0;row < table.length;row++){
		for(int col = 0;col<table[row].length;col++){
			int rand = (int)(Math.random()*71)+7;
			sum+=rand;
			if(rand>max)
			max = rand;
			if(rand<min)
			min = rand;
			table[row][col] = rand;
			System.out.print(table[row][col]+"\t");
		}
		System.out.println();
	}
	System.out.println("The sum is "+sum+" the max is "+max+" the min is "+min);
	System.out.println();
//Program 2
		int[][]table2 = new int[5][4];
		int h = 0;
		int p = 2;
		int j = 1;
		for(int row = 0;row < table2.length;row++){
			for(int col = 0;col<table2[row].length;col++){
				if(col==0)
				h = (int)(Math.pow(2, p));
				if(col==1)
				h = (int)(Math.pow(3,p));
				if(col==2)
				h = (int)(Math.pow(4,j));
				if(col==3)
				h = (int)(Math.pow(5,p));
				table2[row][col] = h;
				System.out.print(table2[row][col]+"\t");
			}
			System.out.println();
			p++;
			j++;
		}
//Program 3
System.out.println();
String[][]table3 = new String[3][3];
		String v = "";
		int cnt = 0;
		for(int row = 0;row < table3.length;row++){
			for(int col = 0;col<table3[row].length;col++){
				v+="*";
				cnt++;
				table3[row][col] = v;
				System.out.print(table3[row][col]+"\t");

			}
			System.out.println();
			v="";
			cnt=0;
		}

	}
	}



