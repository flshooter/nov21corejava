package asgmt_one;
/**
 * @author Richard Croft
 */
public class Pyramids {

	public static void main(String[] args) {
		Wedge wedge = new Wedge();
		Pyramid pyramid = new Pyramid();
		
		// ascending group of asterisks
		System.out.println("1)");
		wedge.wedgeUp(4);
		
		// descending group of asterisks
		System.out.println("\n\n2)");
		wedge.wedgeDown(4);
		
		// ascending group of justified asterisks
		System.out.println("\n3)");
		pyramid.pyrUp(7);
		
		// descending group of justified asterisks
		System.out.println("\n\n4)");
		pyramid.pyrDown(7);
	}
}
