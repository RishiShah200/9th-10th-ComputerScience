import java.awt.Color;
import java.awt.GradientPaint;
public abstract class Shape2{
	//class attributes
	private Location2 loc;
	private Dimension2 dim;
	private Color color;
	public Shape2(Location2 loc, Dimension2 dim, Color color){
		this.color=color;
		this.loc = loc;
		this.dim = dim;

	}

	//accessor method
	public Color getColor(){
		return color;
	}
	public Location2 getLoc(){
		return loc;
	}
	public Dimension2 getDim(){
		return dim;
	}

}