import java.util.ArrayList;
public class ArrayList2DArrayTasks{
	public ArrayList2DArrayTasks(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		int n = (int)(Math.random()*21)+30;
		for(int i = 0; i < n; i++)
			list.add((int)(Math.random()*50)+1);
		System.out.println(list);
		System.out.println();
		//Even Odd Sort
		for(int i = 0; i < n; i++){
			if(list.get(i)%2 == 0)
				temp.add(list.get(i));
			else
				temp.add(0, list.get(i));
		}
		System.out.println(temp);
		System.out.println();
		//Divisible by 3
		for(int i = 0; i < n; i++){
			if(temp.get(i)%2 == 0 && temp.get(i)%3 == 0)
				temp2.add(temp.get(i));
		}
		for(int i = 0; i < temp2.size(); i++)
			temp.add(temp2.get(i));
		System.out.println(temp);
		System.out.println();
		//Store in 2D array
		int count = 0;
		int square = (int)Math.sqrt(temp.size());
		square++;
		int[][] arr = new int[square][square];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				if(temp.size() != 0)
					arr[i][j] = temp.remove(0);
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j] + "\t");
			System.out.println();

		}
		//Diagonal Sum
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < arr.length; i++)
			sum1 += arr[i][i];
		for(int i = 0; i < arr.length; i++)
			sum2 += arr[arr.length-i-1][i];
		System.out.println();
		System.out.println(sum1);
		System.out.println();
		System.out.println(sum2);
		System.out.println();
		//Find Product
		int p = sum1*sum2;
		System.out.println(p);
		System.out.println();
		//Sum of Rows
		int sum5 = 0;
		int sum6 = 0;
		for(int i = 0 ; i < square; i++){
			sum5 += arr[0][i];
			sum6 += arr[arr.length-1][i];
		}
		System.out.println(sum5 + sum6);
		System.out.println();
		//Sum of Columns
		int sum3 = 0;
		int sum4 = 0;
		for(int i = 0 ; i < arr.length; i++){
			sum3 += arr[i][0];
			sum4 += arr[i][arr.length-1];
		}
		System.out.println(sum3 + sum4);
		System.out.println();
		//Difference
		int dif = (sum5+sum6)-(sum3+sum4);
		System.out.println(dif);
		System.out.println();
		//Divide
		System.out.println(p/dif);
		System.out.println();
	}
	public static void main(String[] args){
		ArrayList2DArrayTasks app = new ArrayList2DArrayTasks();
	}
}


