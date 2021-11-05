
package com.ss.cj_day_four_asgmt_two;

/**
 * @author Richard Croft
 */
public class DeadlockDemo {

	public static Object lockTarget1 = new Object();
	public static Object lockTarget2 = new Object();

	public static void main(String[] args) {
		// Runnable for first resource lock
		Runnable d1 = new Runnable() {
			public void run() {
				synchronized (lockTarget1) {
					System.out.println("Locking lockTarget1...");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Waiting to lock lockTarget2");

					synchronized (lockTarget2) {
						System.out.println("Locking both...");
					}
				}
			}
		};
		// Runnable for second resource lock
		Runnable d2 = new Runnable() {
			public void run() {
				synchronized (lockTarget2) {
					System.out.println("Locking lockTarget2...");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Waiting to lock lockTarget1...");
					synchronized (lockTarget1) {
						System.out.println("Locking both...");
					}
				}
			}
		};

		// Threading first resource lock
		new Thread(d1).start();
		// Threading second resource lock
		new Thread(d2).start();

	}

}
