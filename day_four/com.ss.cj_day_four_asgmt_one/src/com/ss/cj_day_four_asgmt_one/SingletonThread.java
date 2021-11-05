
package com.ss.cj_day_four_asgmt_one;

/**
 * @author Richard Croft
 */

public class SingletonThread extends Thread{
	 private Thread t;
	  private String tName;
	  private SingletonDemo single = null;

	  public SingletonThread(String name) {
	    this.tName = name;
	    single = SingletonDemo.getInstance();
	  }

	  public void run() {
	    int hash1 = single.hashCode();
	    System.out.println(tName + " has a SingletonDemo object with hashcode " + hash1);
	  }

	  public void start() {
	   if (t == null) {
	      t = new Thread(this, tName);
	      t.start();
	    }
	  }

}
