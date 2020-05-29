import java.util.ArrayList;
public class businessRunner{

	public businessRunner(){
	ArrayList<Business> list = new ArrayList<>();
	Business business = new Business("McDonald's","Monmouth Junction","732-422-7318",2);
	Business otherbusiness  = new Business ("McDonald's","Monmouth Junction","732-422-7318",1);
	System.out.println(business.compareTo(otherbusiness));
	}

	public static void main(String[]args){

		businessRunner app = new businessRunner();

	}

}