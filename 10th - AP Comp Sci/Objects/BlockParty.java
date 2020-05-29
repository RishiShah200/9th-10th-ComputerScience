import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.awt.GradientPaint;
public class BlockParty /*subclass*/ extends JPanel{	//BlockParty is a JPanel, super class
	ArrayList<Shape> shapes;
	Ellipse2D e;
	JFrame frame;
	public BlockParty(){
		shapes=new ArrayList<Shape>();
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
				shapes.add(new Rectangl(new Location(x,y), new Dimension(width,height), new Color(r,g,b)));
			if(rand==0)
				shapes.add(new Oval(new Location(x,y), new Dimension(width,height), new Color(r,g,b)));
		}
	//	Rectangl r = new Rectangl(new Location(375,275),new Dimension(250,250),Color.GREEN);
	//	e = new Ellipse2D.Double(200,200,150,50);
	//	shapes.add(r);

		frame = new JFrame("Block Party");		//Title, name of program
		frame.add(this);	//Refers to panel called BlockParty
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
			if(shapes.get(x) instanceof Rectangl) {
			g2.setPaint(((Rectangl)shapes.get(x)).getPaint());
				g2.fill(((Rectangl)shapes.get(x)).getRect());
			}

			 else if(shapes.get(x) instanceof Oval)	 {
			   g2.setPaint(((Oval)shapes.get(x)).getPaint());
				g2.fill(((Oval)shapes.get(x)).getOval());
			}
			}
	//	g2.fill(e);



	}
	public static void main(String[]args){

		BlockParty app = new BlockParty();

	}

}
