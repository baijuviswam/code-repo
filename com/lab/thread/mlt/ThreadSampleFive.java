package com.lab.thread.mlt;

public class ThreadSampleFive extends Thread{
	int counter = 0;
	public synchronized void increment(){
		counter++;
	}
	public static void main(String[] args) {
		ThreadSampleFive t5 = new ThreadSampleFive();

		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i=0; i<10000; i++){
					t5.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i=0; i<10000; i++){
					t5.increment();
				}
			}
		});

		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		System.out.println("Counter "+t5.counter);
	}
}