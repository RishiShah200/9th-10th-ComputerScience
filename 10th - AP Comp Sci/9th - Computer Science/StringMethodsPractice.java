import java.util.Scanner;
	public class StringMethodsPractice{
		public static void main (String[]args){
//Program 1
		String name = "My name is Rishi Shah, I Like pie, and code.";
		String newname = name.replaceAll("[.,]","");
		System.out.println(newname);
//Program 2
		System.out.println(newname.toUpperCase());
//Program 3
		int count = 0;
		for(int i = 0;i<newname.length();i++){
			if(newname.charAt(i)==(' '))
				count++;
		}
			System.out.println(count+1);
//Program 4
		String [] arr = new String[count];
//Program 5
		arr = newname.split(" ");
		for(int k = 0;k<arr.length;k++)
			System.out.print(arr[k]);
//Program 6
		System.out.println();
		for(int i = 0; i < arr.length - 1; i++){
				int minIndex = i;
				for(int j = i + 1; j < arr.length; j++){
					if(arr[j].compareTo(arr[minIndex])<0)
						minIndex = j;
				}
				String temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;

			}

			for(int k = 0; k < arr.length; k++)
				System.out.print(arr[k]+" ");
//Program 7
			System.out.println();
			String [] par = {"0","0","0","0","0","0","0","0","0","0",};

			}
	}