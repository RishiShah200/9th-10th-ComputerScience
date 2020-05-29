import javax.swing.*;
import java.awt.*;

public class Assignment5ColorsBallCanvas{
	public static void main (String[]args){
		BallCanvas ballCanvas = new BallCanvas(0,0);
			int a = 1;
			int b = 1;
			int c = 1;
			double f = 0.5;
				Color R = Color.YELLOW;
				for(int y = 1;y<=512;y+=a){
					b += c;
					R=getnextcolor(R);
					//ballCanvas.changeBallColor(R);
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
					ballCanvas.delay(1);
					ballCanvas.repaint();

									}

	}
	public static Color getnextcolor(Color R){

	Color S = Color.YELLOW;
		int color = (int)(Math.random()*100)+1;
			System.out.print(color+" ");
		if(color<=99)
		S=Color.GREEN;
		else if(color<=89)
		S=Color.CYAN;
		if(color<=79)
		S=Color.BLACK;
		if(color<=69)
		S=Color.ORANGE;
		if(color<=59)
		S=Color.RED;
		if(color<=49)
		S=Color.MAGENTA;
		if(color<=39)
		S=Color.ORANGE;
		if(color<=29)
		S=Color.PINK;
		if(color<=19)
		S=Color.YELLOW;
		if(color<=9)
		S=Color.BLUE;
			return S;

				}

}