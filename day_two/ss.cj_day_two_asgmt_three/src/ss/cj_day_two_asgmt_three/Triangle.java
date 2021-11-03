package ss.cj_day_two_asgmt_three;

/**
 * @author Richard Croft
 */
public class Triangle implements Shape {
	private double base = 0;
	private double height = 0;
	private double triArea = 0;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		calculateArea();
		display();
	}

	@Override
	public void calculateArea() {
		this.triArea = (height * base) / 2;
	}

	@Override
	public void display() {
		System.out.printf("The area of a triangle of height %.2f and base of %.2f is: %.2f\n\n", this.height, this.base,
				this.triArea);
	}
}
