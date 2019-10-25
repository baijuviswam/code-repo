package com.lab.thread.mlt;


public class ThreadSampleThree extends Thread{
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i=0; i<10; i++){
					System.out.println("Thread "+i);
				}
			}
		});
		t1.start();
	}
}