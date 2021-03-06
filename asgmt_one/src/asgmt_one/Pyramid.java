package asgmt_one;
/**
 * @author Richard Croft
 * Simple display of ascending and descending stacks of asterisks
 */
public class Pyramid {
	
	public void pyrUp(int maxStars) {
		justifiedStars(maxStars, true);
		printDashes(maxStars + 4);
	}
	public void pyrDown(int maxStars) {
		printDashes(maxStars + 5);
		System.out.println();
		justifiedStars(maxStars, false);
	}

	private void justifiedStars(int maxStars, boolean ascending) {
		String star = "*";
		int center = 0;
		// ascending group of justified asterisks		
		if(ascending) {
			// asc
			center = maxStars/2 + 3;
			for(int cnt = 0; cnt < maxStars; cnt += 2) {
				System.out.printf("%" + center + "s\n", star);
				star = star + "**";
				center++;
				}
			} else {
				// descending group of justified asterisks
				center = maxStars + 2;
				for(int cnt = 0; cnt < maxStars - 1; cnt++) {
					star = star + "*";
				}
				for(int cnt = maxStars; cnt > 0; cnt -= 2) {
					System.out.printf("%" + center + "s\n", star.substring(0,cnt));
					center--;
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
