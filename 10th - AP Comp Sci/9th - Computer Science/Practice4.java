public class Practice4{
	public static void main (String[]args){
	int Tempf = 88;
	double Tempc = ((double)Tempf-32)*5/9;
	System.out.println("The temperature in celsius should be:"+ Tempc);
	double T = 2.8;
	double G = 9.8;
	double pi = 3.1416;
	double L = ((T*T)/(2*pi*2*pi))*G;
	System.out.println("Pendulum Length:"+L);
	double fl = 20.2;
	double v = 68.5;
	double u = ((fl*v))/(v-fl);
	System.out.println("The optic distance is:"+u);


	}
}