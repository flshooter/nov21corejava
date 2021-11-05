
package com.ss.cj_day_four_asgmt_three;

/**
 * @author Richard Croft
 */
public class PandCDriver {

	public static void main(String[] args) {
		ProduceConsume proCon = new ProduceConsume(); // producer consumer object creation
		
		// producer thread
		Thread proThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					proCon.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		// consumer thread
		Thread conThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					proCon.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		// start threads
		proThread.start();
		conThread.start();
		
		// order threads
		try {
			proThread.join();
			conThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
