import java.awt.*;

public class Triangle extends Shape {
	private int side;
	
	public Triangle(int x, int y, Color color, int side) {
		super(x,y,color);
		this.side = side;
	}
	public void draw(Graphics g) {
		g.setColor(getColor());
		int[] xCoordinates = {getX(), getX()+(side/2), getX()+side};
		int[] yCoordinates = {getY(), getY()-side, getY()};
		g.fillPolygon(xCoordinates, yCoordinates, xCoordinates.length);
	}
	public int getWidth() {
		return side;
	}
	public int getHeight() {
		return side;
	}
}
