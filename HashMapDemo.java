import java.util.HashMap;
import java.util.concurrent.*;
public class HashMapDemo extends Thread{
	static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
	public void run(){
		try {
			Thread.sleep(1000);
			map.put(103, "One Hundred");
		}catch(InterruptedException e){
			System.out.println(" Adding an element ");
		}
	}

	public static void main(String[] args) throws InterruptedException{
		map.put(100,"One Hundred");
		map.put(101,"One Hundred and One");
		map.put(102,"One Hundred and Two");

		HashMapDemo hmd = new HashMapDemo();
		hmd.start();

		for(Object o :map.entrySet()){
			System.out.println(o);
			Thread.sleep(1000);
		}
		System.out.println(map);
	}
}