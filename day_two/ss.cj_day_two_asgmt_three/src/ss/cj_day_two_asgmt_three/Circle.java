package ss.cj_day_two_asgmt_three;

/**
 * @author Richard Croft
 */

public class Circle implements Shape {
	private double circleArea = 0;
	private double radius = 0;

	public Circle(double diameter) {
		this.radius = diameter / 2;
		calculateArea();
		display();
	}

	@Override
	public void calculateArea() {
		this.circleArea = Math.pow(radius, 2) * Math.PI;
	}

	@Override
	public void display() {
		System.out.printf("The area of a circle with diameter %.2f is: %.2f\n\n", this.radius * 2, this.circleArea);
	}
}
