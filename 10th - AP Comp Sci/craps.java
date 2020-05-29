public class craps{
		int trials = 10;
		int []wins = new int [5];
		int []losses = new int [5];
		int set = 0;
		double cnt1 = 10;
		double cnt2 = 100;
		double cnt3 = 1000;
		double cnt4 = 10000;
		double cnt5 = 100000;

	public craps(){
		while(set<5){
			for(int x = 0;x<trials;x++){
				if(game()){
					wins[set]++;
				}
				else{
					losses[set]++;
				}
			}
			trials*=10;
			set++;
		}
			System.out.print("Games Played\t");
			System.out.print("10\t100\t1000\t10000\t100000\n");
			System.out.print("Wins:\t\t");
			for(int x = 0;x<wins.length;x++)
				System.out.print(wins[x]+"\t");
			System.out.println();
			System.out.print("Losses:\t\t");
			for(int x = 0;x<wins.length;x++)
				System.out.print(losses[x]+"\t");
			System.out.println();
			System.out.print("Probability\t");
			System.out.print((wins[0]/cnt1)*100+"\t"+(wins[1]/cnt2)*100+"\t"+(wins[2]/cnt3)*100+"\t"+(wins[3]/cnt4)*100+"\t"+(wins[4]/cnt5)*100+"\t");


	}
	public boolean game(){
		int sum = sum(random(0),random(0));
		int cnt = 0;
		int point = 0;
		int sum2 = 0;
		boolean game = false;
		while(cnt<1){
			if(sum==7||sum==11){
				//System.out.println("You have won the game");
				cnt++;
				return true;

			}
			else if (sum==2||sum==3||sum==12){
				//System.out.println("You have lost the game");
				cnt++;
				return false;

			}
			else{
				game=true;
				while(game){
					point = sum;
					sum2 = sum(random(0),random(0));
					if(sum2==7){
						//System.out.println("You lose");
						game=false;
						cnt++;
						return false;
					}
					if(point==sum2) {
						//System.out.println("You won");
						game=false;
						cnt++;
						return true;
					}

					else {
						//System.out.println("You lose");
						//game=false;
						//cnt++;
						//return false;
						game=true;
					}
				}
			}
		}
		return game;
	}
	public static int random(int x){
		int rand = (int)(Math.random()*6)+1;
		return rand;
	}
	public static int sum(int x, int y){
		 return x+y;
	}
	public static void main(String[]args){

	craps app = new craps();

	}


}