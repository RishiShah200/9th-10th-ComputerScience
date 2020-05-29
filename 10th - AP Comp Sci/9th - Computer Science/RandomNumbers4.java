public class RandomNumbers4{
	public static void main (String[]args){
	int sec = 86400;
	int days = (int)(sec/86400);
	int hrs = (int)((sec%86400)/3600);
	int min = (int) (((sec%86400)%3600))/60;
	int seconds = (int)((((sec%86400)%3600))%60)%60;
	System.out.println("Total Seconds: "+sec);
	System.out.print(days+" Days :");
	System.out.print(hrs+" Hours :");
	System.out.print(min+" Minutes :");
	System.out.print(seconds+" Seconds");





	}
}