import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.awt.GradientPaint;
public class Mondrian extends JPanel{
	ArrayList<Shape2> shapes;
	Ellipse2D e;
	JFrame frame;
	public Mondrian(){
		shapes=new ArrayList<Shape2>();
		for(int p = 0;p<20;p++){
			int r = (int)(Math.random()*255)+0;
			int g = (int)(Math.random()*255)+0;
			int b = (int)(Math.random()*255)+0;
			int width = (int)(Math.random()*150)+0;
			int height = (int)(Math.random()*150)+0;
			int rand = (int)(Math.random()*2)+0;
			int x =(int)(Math.random()*500)+0;
			int y = (int)(Math.random()*700)+0;
			if(rand==1)
				shapes.add(new Rectangl2(new Location2(x,y), new Dimension2(width,height), new Color(r,g,b)));
		}

		frame = new JFrame("Mondrian");
		frame.add(this);
		frame.setSize(1000,800);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;


		g2.setColor(Color.MAGENTA);
		g2.fillRect(0,0,frame.getWidth(),frame.getHeight());//left/right/location,up/down,height

		for(int x = 0;x<shapes.size();x++){
			g2.setColor(shapes.get(x).getColor());
			if(shapes.get(x) instanceof Rectangl2) {
			g2.setPaint(((Rectangl2)shapes.get(x)).getPaint());
				g2.fill(((Rectangl2)shapes.get(x)).getRect());
			}

			}
		//	g2.fill(e);



	}

	public static void main(String[]args){

	Mondrian app = new Mondrian();


	}
}