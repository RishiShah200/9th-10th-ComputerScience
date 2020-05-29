public class Assignment7BallCanvas{
	public static void main (String[]args){
		BallCanvas ballCanvas = new BallCanvas(0,0);
			for(int xpos = 0;xpos<538;xpos++){
				int ypos = (int)(0.007106*xpos*xpos-3.816*xpos+512.0);
					ballCanvas.moveBall(xpos,ypos);
					ballCanvas.delay(5);
					ballCanvas.repaint();
											}
}
}