public class SampleQuizProgramming{

	public SampleQuizProgramming(){
		Program1();
		Program2();
		Program3();
	}
	public void Program1(){
		for(int x = 0;x<10;x+=2){
			for(int p = x;p<10;p++){
				System.out.print(p);
			}
			System.out.println(":"+x);
		}
	}
	public void Program2(){
		int x = (int)(Math.random()*6)+1;
		int y = (int)(Math.random()*6)+1;
		System.out.println("Dice 1: "+ x);
		System.out.println("Dice 2: "+ y);
		System.out.println("Sum: " + (x+y));
		System.out.println("Product: " + (x*y));
		if(x>y){
			System.out.println("Difference: "+(x-y));
		}
		else if(y>x){
			System.out.println("Difference: "+(y-x));
		}
		else{
			System.out.println("Difference: "+"0");
		}
	}
	public void Program3(){

		int player1 = 0;
		int player2 = 0;
		while(player1<20&&player2<20){
			int die1 = (int)(Math.random()*6)+1;
			int die2 = (int)(Math.random()*6)+1;
			int die3 = (int)(Math.random()*6)+1;
			int die4 = (int)(Math.random()*6)+1;
				System.out.println("Player 1, Dice 1: "+die1);
				System.out.println("Player 1, Dice 2: "+die2);
				System.out.println("Player 2, Dice 1: "+die3);
				System.out.println("Player 2, Dice 2: "+die4);
		if((die1+die2)>(die3+die4))
			player1+=3;
		else if((die3+die4)>(die1+die2))
			player2+=3;
		if(die1>die3+die4)
			player1+=6;
		if(die3>(die1+die2))
			player2+=6;
		if ((die2)>((die3))&((die2))>((die4)))
			player1+=1;
		if ((die4)>((die1))&((die4))>((die2)))
			player2+=1;
			System.out.println("Player 1 Points: "+player1);
			System.out.println("Player 2 Points: "+player2);
		}


	}

	public static void main (String[]args){
		SampleQuizProgramming app = new SampleQuizProgramming();
	}





}