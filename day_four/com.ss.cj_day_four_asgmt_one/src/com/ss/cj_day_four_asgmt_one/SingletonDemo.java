package com.ss.cj_day_four_asgmt_one;

public class SingletonDemo {

	  private static volatile SingletonDemo instance = new SingletonDemo();

	  private SingletonDemo(){
	  }

	  public static SingletonDemo getInstance() {
	    if(instance == null) {
	      synchronized(instance) {
	        if(instance == null){
	          instance = new SingletonDemo();
	        }
	      }
	    }
	    return instance;
	  }
	}