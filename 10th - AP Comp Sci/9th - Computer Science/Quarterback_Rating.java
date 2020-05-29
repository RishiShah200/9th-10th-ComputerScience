public class Quarterback_Rating{
	public static void main (String[]args){
		int Comp = 296;
		int Att = 495;
		int YDS = 3837;
		int TD = 35;
		int INT = 10;

		double a = (((Comp/(double)Att)*100)-30)/20;
		double b = ((TD/(double)Att)*100)/5;
		double c = (9.5-((INT/(double)Att)*100))/4;
		double d = ((YDS/(double)Att)-3)/4;
		double QB_Rating = (a+b+c+d)/.06;
		System.out.print((double)QB_Rating);





















	}
}