package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return (this.length*this.width);
	}
	
	public double perimeter() {
		return (this.length*2+this.width*2);
	}
	
	public boolean isSmaller(Rectangle otherRectangle) {
		return(this.area() < otherRectangle.area());
	}
	
	public boolean isSquare() {
		return(this.length == this.width);
	}
	
	public void draw() {
		StdDraw.filledRectangle(0.5, 0.5, this.length/2, this.width/2);
	}
	
	public String toString() {
		return("Rectangle with a length of " + this.length + " and a width of " + this.width);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(.25,.3);
		Rectangle r2 = new Rectangle (.1,.2);
		System.out.println("R1 is smaller than R2: " + (r1.isSmaller(r2)));
		System.out.println(r1);
		System.out.println(r2);
		r1.draw();
	}
}
