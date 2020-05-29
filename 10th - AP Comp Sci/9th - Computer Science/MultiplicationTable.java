public class MultiplicationTable{
	public static void main (String[]args){
System.out.print("\t");
for(int i = 0;i<10;i++){
	System.out.print(i+"\t");
}
for(int b = 0; b<10;b++){
	System.out.print("\n"+b+"\t");
		for(int c = 0;c<10;c++){
			System.out.print((b*c)+"\t");
	}
}
}
}