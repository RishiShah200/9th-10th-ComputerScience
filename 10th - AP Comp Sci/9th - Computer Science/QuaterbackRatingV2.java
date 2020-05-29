import java.util.Scanner;
public class QuaterbackRatingV2{
	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);
					System.out.println("Enter Player's Name");
					String player = reader.nextLine();
					System.out.println("Enter Number of Yards");
					int yards = reader.nextInt();
					System.out.println("Enter Number of Completions");
					int completions = reader.nextInt();
					System.out.println("Enter Number of Touchdowns");
					int touchdowns = reader.nextInt();
					System.out.println("Enter Number of Interceptions");
					int interceptions = reader.nextInt();
					System.out.println("Enter Number of Attempts");
					int attempts = reader.nextInt();
					reader.nextLine();
					System.out.println("Enter  Second Player's Name");
					String player2 = reader.nextLine();
					System.out.println("Enter Number of Yards");
					int yards2 = reader.nextInt();
					System.out.println("Enter Number of Completions");
					int completions2 = reader.nextInt();
					System.out.println("Enter Number of Touchdowns");
					int touchdowns2 = reader.nextInt();
					System.out.println("Enter Number of Interceptions");
					int interceptions2 = reader.nextInt();
					System.out.println("Enter Number of Attempts");
					int attempts2 = reader.nextInt();
					double a = (((completions/(double)attempts)*100)-30)/20;
					double b = ((touchdowns/(double)attempts)*100)/5;
					double c = (9.5-((interceptions/(double)attempts)*100))/4;
					double d = ((yards/(double)attempts)-3)/4;
					double QB_Rating = (a+b+c+d)/.06;
					double aa = (((completions2/(double)attempts2)*100)-30)/20;
					double bb = ((touchdowns2/(double)attempts2)*100)/5;
					double cc = (9.5-((interceptions2/(double)attempts2)*100))/4;
					double dd = ((yards2/(double)attempts2)-3)/4;
					double QB_Rating2 = (aa+bb+cc+dd)/.06;
					System.out.println("Player\t\tYards\tCompletions\tTouchdowns\tInterceptions\tAttempts");
					System.out.println(player+"\t"+yards+"\t\t"+completions+"\t\t"+touchdowns+"\t\t"+interceptions+"\t"+attempts+"\tPasser Rating "+QB_Rating);
					System.out.println(player2+"\t"+yards2+"\t\t"+completions2+"\t\t"+touchdowns2+"\t\t"+interceptions2+"\t"+attempts2+"\tPasser Rating "+QB_Rating2);
}
}