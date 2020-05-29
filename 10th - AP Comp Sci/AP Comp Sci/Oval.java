import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.GradientPaint;
public class Oval extends Shape{
	public Oval(Location loc, Dimension dim, Color color){
			super(loc,dim,color);

	}
public Ellipse2D.Double getOval(){

		return new Ellipse2D.Double(getLoc().getX(), getLoc().getY(),getDim().getWidth(), getDim().getHeight());
	}

		public GradientPaint getPaint(){
	 			int r = (int)(Math.random()*256)+0;
	 			int g = (int)(Math.random()*256)+0;
	 			int b = (int)(Math.random()*256)+0;
	 			int r2 = (int)(Math.random()*256)+0;
	 			int g2 = (int)(Math.random()*256)+0;
	 			int b2 = (int)(Math.random()*256)+0;
	 			int x = getLoc().getX();
	 			int y = getLoc().getY();
	 			int width = getDim().getWidth();
	 			int height = getDim().getHeight();
	 			return new GradientPaint(x,y, new Color(r,g,b), x,y+height, new Color(r2,g2,b2));
	 	}

}