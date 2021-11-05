
package com.ss.cj_day_four_asgmt_three;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Richard Croft
 */
public class ProduceConsume {
	
	List<Integer> intList = new ArrayList<>(); // shared List to store jobs
	int maxJobs = 3; // maximum number of jobs at a time
	int jobProLimit = 0; // counter to limit execution
	int jobConLimit = 0; // counter to limit execution
	
	public void producer() throws InterruptedException {
		int job = 0; // job counter
				
		while(jobProLimit < 20) {
			jobProLimit++;
			synchronized (this) {
				while(intList.size() == maxJobs) {
					wait(); // pauses thread while intList has maximum number of jobs
				}
				
				System.out.println("Adding job:" + job);
				
				intList.add(job++); // adds job to intList
				
				notify(); // alerts consumer thread to consume jobs
				
				Thread.sleep(500);
			}
		}
	}
	
	public void consumer() throws InterruptedException {
		while(jobConLimit < 20) {
			jobConLimit++;
			synchronized(this) {
				while (intList.size() == 0) {
					wait(); // pauses while jobs are produced
				}
				
				int jobInProg = intList.remove(0); // removes job at intList[0] 
				
				System.out.println("Finishing job: " + jobInProg);
				
				notify(); // alerts producer thread to add jobs
				
				Thread.sleep(500);
			}
		}
	}	
}
