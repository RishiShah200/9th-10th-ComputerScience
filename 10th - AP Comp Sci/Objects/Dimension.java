import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.GradientPaint;

public class Dimension{
	private int width;
	private int height;
	public Dimension(int width, int height){
		this.width = width;
		this.height = height;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
}
