package ss.cj_day_two_asgmt_three;

/**
 * @author Richard Croft
 */

public class Rectangle implements Shape {
	private double length = 0;
	private double height = 0;
	private double recArea = 0;

	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
		calculateArea();
		display();
	}

	@Override
	public void calculateArea() {
		this.recArea = this.length * this.height;
	}

	@Override
	public void display() {
		System.out.printf("The area of a %.2f X %.2f rectangle is: %.2f\n\n", this.length, this.height, this.recArea);
	}
}
