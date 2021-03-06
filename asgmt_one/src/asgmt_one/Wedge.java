package asgmt_one;
/**
 * @author Richard Croft
 */
public class Wedge {
		
	// public methods to call private methods
	public void wedgeUp(int maxStars) {
		printStars(maxStars, true);
		printDashes(maxStars * 2 + 1);
	}
	public void wedgeDown(int maxStars) {
		printDashes(maxStars * 2 + 2);
		System.out.println();
		printStars(maxStars, false);
	}
		
	// private methods to handle display
	private void printStars(int maxStars, boolean ascending) {
		
		if(ascending) {
			// ascending stack of asterisks
			for(int cnt = 1; cnt < maxStars + 1; cnt++) {
				for(int cnt2 = 0; cnt2 < cnt; cnt2++) {				
				System.out.print("*");
				}
				System.out.println();
			}
		} else {
			// descending stack of asterisks
			for(int cnt = maxStars; cnt > 0; cnt--) {
				for(int cnt2 = cnt; cnt2 > 0; cnt2--) {
					System.out.print("*");
					}
				System.out.println();
				}
			}
		}
	
	private void printDashes(int numDash) {
		// prints row with numDash of dashes
		for(int cnt = 0; cnt < numDash; cnt++) {
			System.out.print("-");
			}
		}
	}



