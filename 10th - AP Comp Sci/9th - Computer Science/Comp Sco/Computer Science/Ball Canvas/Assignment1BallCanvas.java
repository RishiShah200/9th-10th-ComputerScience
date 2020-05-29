public class Assignment1BallCanvas{
	public static void main (String[]args){
		BallCanvas ballCanvas = new BallCanvas(0,0);
		for(int ypos = 0;ypos < 512;ypos++){
			ballCanvas.moveBall(0,ypos);
			ballCanvas.delay(5);   //You can decrease the delay or you can increase the increment of ypos
			ballCanvas.repaint();
		}

	}
	}
