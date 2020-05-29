import java.util.ArrayList;
public class Arrange{

	public Arrange(){
		rearrange(1234);
	}
	public ArrayList<Integer> rearrange(int x){
		ArrayList<Integer> ok = new ArrayList<Integer>();
		int cnt = x;
		while(x>0){
			ok.add(x%10);
			x/=10;
		}
		ArrayList<Integer> permutations = new ArrayList<Integer>();
		if(ok.size()==1)
			permutations.add(ok.get(0));
		if(ok.size()==2){
			permutations.add(cnt);
			int extra = ok.get(0)*10+ok.get(1);
			permutations.add(extra);
		}
		if(ok.size()==3){
			int cnt2 = 0;
			for(int s = 0;s<ok.size();s++){
				for(int l = 0;l<ok.size();l++){
					for(int y = 0;y<ok.size();y++){
						cnt2 = ok.get(s)*100+ok.get(l)*10+ok.get(y);
						if((s!=l)&&(s!=y)&&(l!=y))
							permutations.add(cnt2);
						cnt2=0;
					}
				}
			}
		}
		if(ok.size()==4){
			int cnt3 = 0;
			for(int s = 0;s<ok.size();s++){
				for(int l = 0;l<ok.size();l++){
					for(int y = 0;y<ok.size();y++){
						for(int o = 0;o<ok.size();o++){
						cnt3 = ok.get(s)*1000+ok.get(l)*100+ok.get(y)*10+ok.get(o);
						if((s!=l)&&(s!=y)&&(s!=o)&&(l!=y)&&(l!=o)&&(y!=o))
							permutations.add(cnt3);
						cnt3=0;
						}
					}
				}
			}

		}
		int min = 1000000;
		int max = 0;
		for(int l = 0;l<permutations.size();l++){
			if(permutations.get(l)>max){
				max = permutations.get(l);
			}
			else if(permutations.get(l)<min){
				min = permutations.get(l);
			}
		}
		int sum = 0;
		for(int i = 0;i<permutations.size();i++){
			int j = i;
			while(j>0&&permutations.get(j)<permutations.get(j-1)){
				int temp = permutations.get(j);
				permutations.set(j,permutations.get(j-1));
				permutations.set(j-1,temp);
				j--;
			}
		}
		double median = 0;
		if(permutations.size()%2==1)
			median = permutations.get(permutations.size()/2);
		else
			median = (double)(permutations.get(permutations.size()/2)+permutations.get((permutations.size()/2)-1))/2;
		System.out.println(permutations);
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		System.out.println("Median: "+median);
			return ok;
		}


	public static void main(String[]args){

	Arrange app = new Arrange();

	}

}