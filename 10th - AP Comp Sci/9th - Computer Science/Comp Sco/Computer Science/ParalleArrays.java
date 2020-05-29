import java.util.Scanner;
	public class ParalleArrays{
		public static void main (String[]args){
			Scanner reader = new Scanner (System.in);

	String[] street = new String[5];
	int[] number = new int[5];
	String[] aprt = new String[5];
	String[] code = new String[5];


	/*for(int j = 0; j < number.length; j++){
		System.out.println("Individual #"+(j+1));
		System.out.println("Street number? ");
		number[j] = reader.nextInt();
		System.out.println("Street? ");
		reader.nextLine();
		street[j] = reader.nextLine();
		System.out.println("Apartment? (Uppercase letteror - if this doesn't apply");
		aprt[j] = reader.nextLine();
		System.out.println("Zip Code? ");
		code[j] = reader.nextLine();
		reader.nextLine();
		System.out.println();

	}
	for(int i = 0; i < number.length; i++){
		if(aprt[i].equals("-")){
			System.out.print(number[i]+" "+street[i]+" "+code[i]);
			System.out.println();
		}
		else{
			System.out.print(number[i]+" "+street[i]+" "+aprt[i]+" "+code[i]);
			System.out.println();
		}

	}
	*/
// Program 2
		String[] firstname = new String[6];
		String[] lstinitial = new String[6];
		String [] id = new String [6];
		double[] earned = new double[6];
		double[] possible = new double[6];
	for(int x = 0; x < lstinitial.length; x++){
		System.out.println("Individual #"+(x+1));
		System.out.println("First Name? ");
		firstname[x] = reader.nextLine();
		System.out.println("Last Initial? ");
		lstinitial[x] = reader.nextLine();
		System.out.println("Id Number? (Uppercase letteror - if this doesn't apply");
		id[x] = reader.nextLine();
		System.out.println("Points Earned ");
		earned[x] = reader.nextDouble();
		System.out.println("Points Possible");
		possible[x] = reader.nextDouble();
		System.out.println();
		reader.nextLine();

	}
		for(int b = 0; b < lstinitial.length; b++){
			System.out.print(firstname[b]+" "+lstinitial[b]+" "+id[b]+" "+earned[b]+" "+possible[b]+" "+(((earned[b]/possible[b])*100)+"%"));
			System.out.println();
		}
	}
}