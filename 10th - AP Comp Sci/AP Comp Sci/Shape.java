import java.awt.Color;
import java.awt.GradientPaint;
public abstract class Shape{
	//class attributes
	private Location loc;
	private Dimension dim;
	private Color color;
	public Shape(Location loc, Dimension dim, Color color){
		this.color=color;
		this.loc = loc;
		this.dim = dim;

	}

	//accessor method
	public Color getColor(){
		return color;
	}
	public Location getLoc(){
		return loc;
	}
	public Dimension getDim(){
		return dim;
	}

}