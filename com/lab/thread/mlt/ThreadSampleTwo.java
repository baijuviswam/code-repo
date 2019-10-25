package com.lab.thread.mlt;

class RunnerTwo implements Runnable{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Thread "+i);
			try{
				Thread.sleep(100);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class ThreadSampleTwo{
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnerTwo());
		Thread t2 = new Thread(new RunnerTwo());
		Thread t3 = new Thread(new RunnerTwo());

		t1.start();
		t2.start();
		t3.start();
	}
}