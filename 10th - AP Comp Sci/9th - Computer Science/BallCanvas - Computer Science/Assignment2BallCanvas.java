public class Assignment2BallCanvas{
	public static void main (String[]args){
		BallCanvas ballCanvas = new BallCanvas(0,0);
			for(int ypos = 512;ypos>0;ypos--){
					ballCanvas.moveBall(0,ypos);
					ballCanvas.repaint();
					ballCanvas.delay(5);
			}
				for(int ypos2 = 0;ypos2 < 512;ypos2++){
							ballCanvas.moveBall(0,ypos2);
							ballCanvas.delay(5);   //You can decrease the delay or you can increase the increment of ypos
							ballCanvas.repaint();
		}

}
}