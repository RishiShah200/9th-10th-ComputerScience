import java.awt.Color;
import java.awt.Rectangle;
import java.awt.GradientPaint;
public class Rectangl extends Shape{

	public Rectangl(Location loc, Dimension dim, Color color){
		super(loc,dim,color);

	}
	public Rectangle getRect(){

		return new Rectangle(getLoc().getX(), getLoc().getY(),getDim().getWidth(), getDim().getHeight());
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