public class craps{
		int trials = 10;
		int []wins = new int [5];
		int []losses = new int [5];
		int set = 0;

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

	}
	public boolean game(){
		int sum = sum(random(0),random(0));
		int cnt = 0;
		int point = 0;
		boolean game = false;
		while(cnt<1){
			if(sum==7||sum==11){
				System.out.println("You have won the game");
				cnt++;
				return true;

			}
			else if (sum==2||sum==3||sum==12){
				System.out.println("You have lost the game");
				cnt++;
				return false;

			}
			else{
				game=true;
				while(game){
					sum = sum(random(0),random(0));
					point  = sum;
					if(point==sum) {
						System.out.println("You won");
						game=false;
						cnt++;
						return true;
					}
					else {
						System.out.println("You lose");
						game=false;
						cnt++;
						return false;
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
