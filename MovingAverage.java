import java.util.Queue;
import java.util.ArrayDeque;

public class MovingAverage{
	private final Queue<Integer> window;
	private final int maxSize;
	private double sum = 0.0;
	public MovingAverage(int maxSize){
		this.window = new ArrayDeque<>(maxSize + 1);
		this.maxSize = maxSize;
	}

	public double next(int val){
		window.add(val);
		sum += val;
		if (window.size() > maxSize) {
            sum -= window.poll();
        }
        return sum / window.size();
	}

	public static void main(String[] args) {
		MovingAverage mv = new MovingAverage(3);
		System.out.println(mv.next(10));
		System.out.println(mv.next(4));
		System.out.println(mv.next(7));
		System.out.println(mv.next(2));
		System.out.println(mv.next(5));
		System.out.println(mv.next(6));
		System.out.println(mv.next(10));
		System.out.println(mv.next(4));
		System.out.println(mv.next(7));
		System.out.println(mv.next(2));
		System.out.println(mv.next(5));
		System.out.println(mv.next(6));
		System.out.println(mv.next(10));
		System.out.println(mv.next(4));
		System.out.println(mv.next(7));
		System.out.println(mv.next(2));
		System.out.println(mv.next(5));
		System.out.println(mv.next(6));
	}
}