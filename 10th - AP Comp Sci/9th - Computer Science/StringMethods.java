import java.util.Scanner;
	public class StringMethods{
		public static void main (String[]args){
//Program 1
		String name = "The five boxing wizards jump quickly.";
			for(int i = name.length();i>0;i--)
				System.out.print(name.charAt(i-1));
//Program 2

			for(int i = name.length();i>0;i--)
				name += (name.charAt(i-1));
				System.out.println();
				System.out.print(name.substring(37));


//Program 3
			name = "The five boxing wizards jump quickly.";
			System.out.println();
			System.out.println(name.toUpperCase());
//Program 4
			name = name.replaceAll("a","W");
			name = name.replaceAll("e","W");
			name = name.replaceAll("i","W");
			name = name.replaceAll("o","W");
			name = name.replaceAll("u","W");
			System.out.println(name);
//Program 5
			name = "The five boxing wizards jump quickly.";
			for(int i = 0;i<name.length() - 1;i+=2){
				System.out.print(name.substring(i,i+1));
			}
//Program 6
			System.out.println();
			int count = 0;
			for(int i = 0;i<name.length();i++){
				if(name.charAt(i)==(' '))
					count++;
			}
			System.out.println(count+1);
//Program 7
			int total = 0;
			for(int i = 0;i<name.length();i++){
				if(name.charAt(i)!=(' '))
					total++;
			}
			System.out.print(total/count);
//Program 8
			System.out.println();
			String [] arr = {"THE","FIVE","BOXING","WIZARDS","JUMP","QUICKLY"};
			String[] animals = name.split(" ");
			for(int k = 0;k<arr.length;k++)
				System.out.print(arr[k]);

}
}