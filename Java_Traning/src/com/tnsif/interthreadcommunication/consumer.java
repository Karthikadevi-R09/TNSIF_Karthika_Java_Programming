package com.tnsif.interthreadcommunication;

public class consumer extends Thread {
	 Q obj;

	   public consumer(Q obj) {
	      this.obj = obj;
	      this.start();
	   }

	   public void run() {
	      while(true) {
	         try {
	            Thread.sleep(3000L);
	         } catch (Exception var2) {
	            System.out.println(var2);
	         }

	         this.obj.get();
	      }
	   }

}
