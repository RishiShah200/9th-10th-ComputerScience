import java.awt.Color;
import java.awt.Rectangle;
import java.awt.GradientPaint;
public class Rectangl2 extends Shape2{

	public Rectangl2(Location2 loc, Dimension2 dim, Color color){
		super(loc,dim,color);

	}
	public Rectangle getRect(){

		return new Rectangle(getLoc().getX(), getLoc().getY(),getDim().getWidth(), getDim().getHeight());
	}

	}