
package com.ss.cj_day_four_asgmt_one;

/**
 * @author Richard Croft Simple demo of double checked locking
 */
public class SingleDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonThread singleton1 = new SingletonThread("SingletonT1");
	    singleton1.start();
	    SingletonThread singleton2 = new SingletonThread("SingletonT2");
	    singleton2.start();
	}

}
