import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.util.concurrent.TimeUnit;

import java.util.ArrayList;
public class Example extends JPanel implements KeyListener,MouseListener{	//Interface

	JFrame frame;
	String st = "Hello";
	int [] arr = new int [100000];
	int x = 100, y = 100;
	int ballx = 500, bally = 400;
	public Example(){
		frame = new JFrame("Example Program!");
		frame.add(this);
		frame.addKeyListener(this);
		frame.addMouseListener(this);
		frame.setSize(1000,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(new Color(12,15,180));
		g.fillRect(0,0,frame.getWidth(),frame.getHeight());
		g.setColor(new Color(0,255,12));
		g.setFont(new Font("Broadway", Font.PLAIN,100));
		g.drawString(st,x,y);
		g.setColor(new Color(255,255,255));
		g.fillOval(ballx,bally,30,30);
	}
	public void keyReleased(KeyEvent e){

	}
	public void keyPressed(KeyEvent e){
		//System.out.println(e.getKeyCode());
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		if(e.getKeyCode()==68){	//D
			st = "Right";
			x+=10;
		}
		if(e.getKeyCode()==65){	//A
			st = "Left";
			x-=10;
		}
		if(e.getKeyCode()==87){	//S
			st = "Up";
			y-=10;
		}
		if(e.getKeyCode()==83){	//W
			st = "Down";
			y+=10;
		}
		if(e.getKeyCode()==49){	//1
			st = "Diagonal";
			y-=10;
			x+=10;
		}
		if(e.getKeyCode()==50){
			y-=10;
			x-=10;
		}
		if(e.getKeyCode()==51){
			y+=10;
			x+=10;
		}
		if(e.getKeyCode()==52){
			y+=10;
			x-=10;
		}
		if(e.getKeyCode()==57){
			bally-=10;
		}
		if((y == bally && x==ballx)||(bally==y&&ballx==x)){
			st = "You Lost";
			repaint();
			for(int x = 0;x<1000;x++)
				System.out.println("");
			frame.getContentPane().removeAll();
			frame.repaint();
			st = "This Worked";
		}
		repaint();
	}
	public void keyTyped(KeyEvent e){

	}
	public void mouseExited(MouseEvent e){

	}
	public void mouseEntered(MouseEvent e){

	}
	public void mouseReleased(MouseEvent e){

	}
	public void mousePressed(MouseEvent e){

	}
	public void mouseClicked(MouseEvent e){
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public static void main(String[]args){
		playMusic("music.wav");
		Example app = new Example();

	}
	public static void playMusic(String filepath){
		InputStream music;
		try{
			music = new FileInputStream(new File(filepath));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
   }

}