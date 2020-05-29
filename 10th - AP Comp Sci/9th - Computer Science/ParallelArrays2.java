import java.util.Scanner;
	public class ParallelArrays2{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
		//Program 1
		String [] name  = {"Clayton Kershaw", "Jake Arrieta", "David Price", "Max Scherzer", "Chris Sale", "Dallas Keuchel", "Zack Greinke", "Corey Kluber", "Gerrit Cole"};
		String [] team  = {"Dodgers", "Cubs","Red Sox","Nationals","White Sox","Astros","Dodgers","Indians","Pirates"};
		int [] wins = {16,22,18,14,13,20,19,9,19};
		int winner = 0;
		int [] losses = {7,6,5,12,11,8,3,16,8};
		int [] games = {33,33,32,33,31,33,32,32,32};
		double [] IP = {232.2,229,220.1,228.2,208.2,232,222.2,222,208};
		double [] K = {11.64,9.28,9.19,10.86,11.82,8.38,8.08,9.93,8.74};
		double [] BB = {1.62,1.89,1.92,1.34,1.81,1.98,1.62,1.82,1.9};
		double [] ERA = {2.13,1.77,2.45,2.79,3.41,2.48,1.66,3.49,2.6};
	while(winner==0){
		System.out.println("Which players stats would you like to research?");
		String player = reader.nextLine();
		if(player.equals("Quit"))
			winner++;
		System.out.println("Which stat would you like?");
		String stat = reader.nextLine();
		if(player.equals("Quit"))
			winner++;
		int x = 0;
			for(int i = 0; i<name.length;i++){
				if(name[i].equals(player))
				x=i;
			}
				if(stat.equalsIgnoreCase("Team"))
					System.out.println(player+" is on "+team[x]);
				if(stat.equalsIgnoreCase("Wins"))
					System.out.println(player+" had "+wins[x]+" wins");
				if(stat.equalsIgnoreCase("Losses"))
					System.out.println(player+" had "+losses[x]+" losses");
				if(stat.equalsIgnoreCase("Games"))
					System.out.println(player+" played "+games[x]+" games");
				if(stat.equalsIgnoreCase("IP"))
					System.out.println(player+" pitched "+IP[x]+" innings");
				if(stat.equalsIgnoreCase("K/9"))
					System.out.println(player+" had "+K[x]+" strikeouts");
				if(stat.equalsIgnoreCase("BB/9"))
					System.out.println(player+" batted "+BB[x]+" bases");
				if(stat.equalsIgnoreCase("ERA"))
					System.out.println(player+" ERA is "+ERA[x]);
		}
	//Program 2
		System.out.println("How many inputs would you like");
		int input = reader.nextInt();
		reader.nextLine();
		String[] names = new String[input];
		int[] age = new int[input];
		double [] height = new double [input];
		double[] weight = new double[input];
		double avgage = 0;
		double avgh = 0;
		double avgw = 0;
			for(int x = 0; x < age.length; x++){
				System.out.println("Individual #"+(x+1));
				System.out.println("Name? ");
				names[x] = reader.nextLine();
				System.out.println("Age? ");
				age[x] = reader.nextInt();
				avgage+=age[x];
				System.out.println("Height");
				height[x] = reader.nextDouble();
				avgh+=height[x];
				System.out.println("Weight");
				weight[x] = reader.nextDouble();
				avgw+=weight[x];
				System.out.println();
				reader.nextLine();

	}
				avgage = avgage/input;
				avgh = avgh/input;
				avgw = avgw/input;
				int inch = (int)(avgh%12);
				int feet = (int)(avgh/12);
				System.out.print("Average age: "+avgage+" Average height: "+feet+" feet "+inch+" inches "+"Average Weight: "+avgw);
				System.out.println();
	}
}