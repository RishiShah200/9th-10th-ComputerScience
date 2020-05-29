import java.util.ArrayList;
public class NumFinder implements Call{

	private ArrayList<Integer> list = new ArrayList<>();

	public NumFinder(ArrayList<Integer> list){
		this.list = list;

	}

	public int sum(){
		int sum = 0;
		for(int x:list)
			sum+=x;
		return sum;

	}
	}

