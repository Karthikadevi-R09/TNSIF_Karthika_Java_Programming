package com.tnsif.interthreadcommunication;

public class interthreadcommunicationdemo {
public static void main(String[] args) {
		
		//Shared Resource
		Q obj=new Q();
		
		producer p1=new producer(obj); //Producer thread
		consumer c1=new consumer(obj); //Consumer thread
					
		try {
			p1.join();
			c1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
