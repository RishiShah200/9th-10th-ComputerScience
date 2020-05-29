public class Assignment4BallCanvas{
	public static void main (String[]args){
		BallCanvas ballCanvas = new BallCanvas(0,0);
		int ypos2 = 1024;
			for(int ypos = 0;ypos < 1024;ypos++){
				ypos2--;
				if(ypos<512){
						ballCanvas.moveBall(0,ypos);
					ballCanvas.delay(5);
					ballCanvas.repaint();
			}
			 else{
				ballCanvas.moveBall(0,ypos2);
				ballCanvas.delay(5);
				ballCanvas.repaint();
			}


	}
}
}