package ar.edu.unq.po2.tp3;

public class Point {
	
	private float x;
	private float y;
	
	public Point(float x, float y) {
		super();
		this.setXY(x, y);
	}
	
	public Point() {
		this.setXY(0, 0);
	}
	
	public void setXY( float x, float y ) {
		this.setX(x);
		this.setY(y);
	}
	
	public float getX() {
		return x;
	}
	
	
	public void setX(float x) {
		this.x = x;
	}
	
	
	public float getY() {
		return y;
	}
	
	
	public void setY(float y) {
		this.y = y;
	}
	
	
	public void movePointTo(float x, float y) {
		this.setXY(x, y);
	}
	
	public Point addsPoints(Point p1, Point p2) {
		float newX = p1.getX() + p2.getX();
		float newY = p1.getY() + p2.getY();
		return new Point(newX, newY);
	}

}
