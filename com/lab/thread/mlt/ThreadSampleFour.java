package com.lab.thread.mlt;

import java.util.Scanner;

class Processor extends Thread {
	public volatile boolean running = true;
	public void run(){
		while(running){
			System.out.println("Hello");
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public void shoutdown(){
		running = false;
	}
}
public class ThreadSampleFour{
	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();
		System.out.println("Press enter to stop !!");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		p1.shoutdown();
	}
}