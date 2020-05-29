import javax.swing.*;
import java.awt.*;

public class Assignment5BallCanvas{
	public static void main (String[]args){
				BallCanvas ballCanvas = new BallCanvas(0,0);
				for(int ypos = 0;ypos < 512;ypos++){
							ballCanvas.moveBall(250,ypos);
							ballCanvas.delay(5);
							ballCanvas.repaint();
				}
						for(int ypos = 512;ypos>0;ypos--){
										ballCanvas.moveBall(300,ypos);
										ballCanvas.repaint();
										ballCanvas.delay(5);
					}
		}
}