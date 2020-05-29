import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;
import java.util.ArrayList;

public class Mondrian extends JPanel{
	ArrayList<Shape2> shapes;
	JFrame frame;
	public Mondrian(){
		shapes=new ArrayList<Shape2>();
		for(int k = 0;k<1000000;k++){
			int width = (int)(Math.random()*100)+50;
			int height = (int)(Math.random()*100)+50;
			int x =(int)(Math.random()*700)+0;
			int y = (int)(Math.random()*650)+0;
			int rand = (int)(Math.random()*4)+0;
			Rectangl2 temp = new Rectangl2 (new Location2 (x,y), new Dimension2(width,height), Color.RED);
			boolean inter = false;
			for(Shape2 other:shapes){
				if(((Rectangl2)temp).getRect().intersects(((Rectangl2)other).getRect()))
					inter=true;
			}
			if(!inter)
				shapes.add(new Rectangl2 (new Location2 (x,y), new Dimension2(width,height), getColor()));
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
		g2.setStroke(new BasicStroke(5));
		g2.setColor(Color.WHITE);
		g2.fillRect(0,0,frame.getWidth(),frame.getHeight());//left/right/location,up/down,height
		for(int b = 1;b<8;b++){
			int rand = (int)(Math.random()*1000);
			g.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(7));
			g.drawLine(rand,0,rand,1200);
		}
		for(int b = 1;b<8;b++){
				int rand = (int)(Math.random()*800);
				g.setColor(Color.BLACK);
				g2.setStroke(new BasicStroke(7));
				g.drawLine(0,rand,1200,rand);
		}
		for(int x = 0;x<shapes.size();x++){
			g2.setColor(shapes.get(x).getColor());
			if(shapes.get(x) instanceof Rectangl2) {
		//	g2.setPaint(((Rectangl2)shapes.get(x)).setColor());
				g2.fill(((Rectangl2)shapes.get(x)).getRect());
			}
		for(int n = 0;n<shapes.size();n++){
			g2.setColor(shapes.get(n).getColor());
			g2.fill(((Rectangl2)shapes.get(n)).getRect());
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(7));
			g2.draw(((Rectangl2)shapes.get(n)).getRect());
		}

			}
		//	g2.fill(e);

		}
			public Color getColor(){
					int rand = (int)(Math.random()*4)+1;
					if(rand==1)
						return Color.RED;
					if(rand==2)
						return Color.BLUE;
					if(rand==3)
						return Color.YELLOW;
					return Color.BLACK;
			}
		public static void main(String[]args){

		Mondrian app = new Mondrian();


	}
}