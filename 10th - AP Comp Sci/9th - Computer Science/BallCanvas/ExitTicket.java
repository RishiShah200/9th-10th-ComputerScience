public class ExitTicket{
	public static void main(String[]args){

		BallCanvas ballCanvas = new BallCanvas(300,200);
		for (int i=300;i<400;i++){
				ballCanvas.moveBall(i,200);
				ballCanvas.delay(5);
				ballCanvas.repaint();
		}
	}
}
