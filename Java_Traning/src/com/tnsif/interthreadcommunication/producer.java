package com.tnsif.interthreadcommunication;

public class producer extends Thread {
	Q obj;

	public producer(Q obj) {

		this.obj = obj;
		start();
	}

	public void run() {
		int i = 0;
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
			obj.put(i);
			i++;
		}
	}

}
