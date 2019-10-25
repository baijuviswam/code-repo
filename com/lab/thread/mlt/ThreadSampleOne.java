package com.lab.thread.mlt;

class Runner extends Thread{
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

public class ThreadSampleOne {
	public static void main(String[] args) {
		Runner t1 = new Runner();
		t1.start();
		
		Runner t2= new Runner();
		t2.start();

		Runner t3= new Runner();
		t3.start();
	}
}