public class Assignment5BallCanvas{
	public static void main (String[]args){
		BallCanvas ballCanvas = new BallCanvas(0,0);
			int a = 1;
			int b = 1;
			int c = 1;
				for(int y = 1;y<=512;y+=a){
					b += c;
					if(y == 0)
						a*=-1;
					if(y==512)
						a*=-1;
					if(b==0)
						c*=-1;
					if(b==537)
						c*=-1;
					ballCanvas.moveBall(b,y);
					ballCanvas.delay(1);
					ballCanvas.repaint();
									}
	}
	}