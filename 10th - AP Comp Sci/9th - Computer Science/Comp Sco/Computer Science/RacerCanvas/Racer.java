public class Racer{
	public static void main(String[]args){
		RacerCanvas race = new RacerCanvas(800,800);
			race.setFiles("racer1.png","racer2.png","racer3.png");//This sets up the images for the program which are 200 pixels horizontal
	int i = 1;      //These are all variables i have declared
	int x1 = 0;
	int x2 = 0;
	int x3 = 0;
	int wins = 0;
	int wins2 = 0;
	int wins3 = 0;
	int lbj = 0;
	int kd = 0;
	int bball = 0;
		for(int x = 0;x<3;x++){ //For loop so that the code runs 3 times because it is supposed to run 3 times
			race.moveRacer1(0,210);//Initial Position of the images
			race.moveRacer2(0,0);
			race.moveRacer3(0,442);
			race.repaint();
				x1 = 0;//This resets the variables to zero after the code runs each time
				x2 = 0;
				x3 = 0;
				int j = 0;
				int b = 0;
				int y = 0;
			while(j==b||b==y||j==y){//This will produce random numbers that are not equal to each other
				 j = (int)(Math.random()*10)+1;//Code for random numbers
				 b = (int)(Math.random()*10)+1;
				 y = (int)(Math.random()*10)+1;
									}
			while((x1<500)||(x2<500)||(x3<500)){//This will run while the position of the x of the 3 objects are less than 500 then the code keeps running
				race.moveRacer1(x2,210);//This wil move the objects x posiiton based on the random number
				race.delay(5);
				race.moveRacer2(x1,0);
				race.delay(5);
				race.moveRacer3(x3,442);
				race.delay(5);
				race.repaint();
			if(x1<500)//If the x position of the objects are less than zero it keeps adding the random number until it gets to 500
				x1+=j;
			if(x2<500)
				x2+=b;
			if(x3<500)
				x3+=y;
												}
				if(j>b&&j>y){///This will determine which objects are ahead of each other
					lbj++;
						if(b>y){
							race.setPlaces("Lebron James is in 1st. Basketball is in 2nd. Kevin Durant is in 3rd.",0,200,25);
									}
						else if(y>b){
							race.setPlaces("Lebron James is in 1st. Kevin Durant is in 2nd. Basketball is in 3rd.",0,200,25);
									}
											}
				if(b>y&&b>j){///This will determine which objects are ahead of each other
					bball++;
						if(y>j){
							race.setPlaces("Basketball is in 1st. Kevin Durant is in 2nd. Lebron James is in 3rd.",0,200,25);
								}
						else if(j>y){
							race.setPlaces("Basketball is in 1st. Lebron James is in 2nd. Kevin Durant is in 3rd.",0,200,25);
									}

							}
				if(y>j&&y>b){///This will determine which objects are ahead of each other
					kd++;
						if(j>b){
							race.setPlaces("Kevin Durant is in 1st. Lebron James is in 2nd. Basketball is in 3rd.",0,200,25);
								}
						else if(b>j){
							race.setPlaces("Kevin Durant is in 1st. Basketball is in 2nd. Lebron James is in 3rd.",0,200,25);
								}
							}
			race.showText(true);//This will show the text for a certain time and then stop showing the text
			race.delay(5000);
			race.showText(false);
			race.repaint();
										}
				if(lbj>bball&&lbj>kd){//This determines the final winner
					race.setPlaces("Lebron James is your final winner",0,200,25);
						race.showText(true);
						race.delay(1000);
						race.showText(false);
										}
				if(bball>kd&&bball>lbj){//This determines the final winner
					race.setPlaces("Basketball is your final winner",0,200,25);
						race.showText(true);
						race.delay(1000);
						race.showText(false);
										}
				if(kd>lbj&&kd>bball){//This determines the final winner
					race.setPlaces("Kevin Durant is your final winner",0,200,25);
						race.showText(true);
						race.delay(1000);
						race.showText(false);
									}
				if(kd==lbj&&lbj==bball){//This will determine if everyone has tied
					race.setPlaces("Kevin Durant and Lebron James have tied",0,200,25);
						race.showText(true);
						race.delay(1000);
						race.showText(false);
										}
				else if(lbj==bball){//This determines if 2 of the objects are tied
					race.setPlaces("Lebron James and Basketball have tied",0,200,25);
						race.showText(true);
						race.delay(1000);
						race.showText(false);
									}
				else if(kd==bball){//This determines if 2 of the objects are tied
					race.setPlaces("Kevin Durant and Basketball have tied",0,200,25);
						race.showText(true);
						race.delay(1000);
						race.showText(false);
									}
				else if(kd==lbj){//This determines if 2 of the objects are tied
				race.setPlaces("Everyone has tied",0,200,25);
					race.showText(true);
					race.delay(1000);
					race.showText(false);
								}
		}
		}














