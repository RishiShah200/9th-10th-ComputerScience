public class WILLTHISWORK{
	public static void main (String[]args){
		BallCanvas ballCanvas = new BallCanvas(0,0);
		int xpos2 = 0;
		int xpos = 0;
		for(int ypos = 0;ypos<512;ypos++){
			xpos2++;
			ballCanvas.moveBall(xpos2,ypos);
			ballCanvas.delay(5);
			ballCanvas.repaint();
			if(xpos2==511){
			for(int y = 512;y<0;y--){
				ballCanvas.moveBall(xpos2,ypos);
				ballCanvas.delay(5);
				ballCanvas.repaint();
			}
		}
}

		}
		}