public class PracticeIt{

	public PracticeIt(){
		System.out.print(distance(1,0,4,4));
	}
	public double distance(double x1,double y1, double x2, double y2){
	    double xdistance = Math.sqrt((x2-x1)*(x2-x1));
	    double ydistance = Math.sqrt((y2-y1)*(y2-y1));
	    double finaldistance = xdistance+ydistance;
	    return finaldistance;
	}
	public static void main(String[]args){

	PracticeIt app =  new PracticeIt();

	}

}