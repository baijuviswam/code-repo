package com.lab.thread.mlt;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/** ExecutorService example **/

class Processor implements Runnable{
	int id;
	public Processor(int id){
		this.id = id;
	}
	public void run(){
		System.out.println("Starting Thread : "+id);
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Ending Thread : "+id);
	}

}
public class ThreadSampleSix {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(12);
	
		int i=0;
		while(i<15){
			executor.submit(new Processor(i));
			++i;
		}

		executor.shutdown();

		System.out.println("All taks Submitted");

		try{
			executor.awaitTermination(1, TimeUnit.MINUTES);
		}catch(InterruptedException w){
			w.printStackTrace();
		}
		System.out.println("All taks Completed");
	}
}
