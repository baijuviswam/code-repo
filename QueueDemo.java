import java.util.Queue;
import java.util.ArrayDeque;

public class QueueDemo {
	public static void main(String[] args) {
		Queue <Integer> queue = new ArrayDeque<Integer>(3);
		queue.add(1000);
		queue.add(1001);
		queue.add(1002);
		queue.add(1003);
		System.out.println("Queue :"+queue);
		System.out.println("Size of the Queue :"+queue.size());
		while(queue.size()>0){
			System.out.println(queue.poll());
		}
	}
}