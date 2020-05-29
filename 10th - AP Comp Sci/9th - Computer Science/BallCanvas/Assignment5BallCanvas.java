import javax.swing.*;
import java.awt.*;

public class Assignment5BallCanvas{
	public static void main (String[]args){
		BallCanvas ballCanvas = new BallCanvas(0,0);
			int a = 1;
			int b = 1;
			int c = 1;

				Color R = Color.YELLOW;
				for(int y = 1;y<=512;y+=a){
					b += c;
					R=getnextcolor(R);
					ballCanvas.changeBallColor(R);
					if(y == 0){
						a*=-1;
						R=getnextcolor(R);
						ballCanvas.changeBallColor(R);
								}
					if(y==512){
						a*=-1;
						R=getnextcolor(R);
						ballCanvas.changeBallColor(R);
							}
					if(b==0){
						c*=-1;
						R=getnextcolor(R);
						ballCanvas.changeBallColor(R);
							}
					if(b==537){
						c*=-1;
						R=getnextcolor(R);
						ballCanvas.changeBallColor(R);
								}
					ballCanvas.moveBall(b,y);
					ballCanvas.delay(5);
					ballCanvas.repaint();

									}

	}
	public static Color getnextcolor(Color R){
					Color S;
					if(R==Color.YELLOW)
										S=Color.ORANGE;
									else if (R==Color.ORANGE)
									S=Color.GREEN;
									else if (R==Color.GREEN)
									S=Color.BLUE;
									else if(R==Color.BLUE)
									S=Color.CYAN;
									else if (R==Color.CYAN)
									S=Color.MAGENTA;
									else if (R==Color.MAGENTA)
									S=Color.PINK;
									else if (R==Color.PINK)
									S=Color.red;
									else
									S=Color.YELLOW;
						return S;
				}

}