import java.util.Queue;
import java.util.LinkedList;

public class ZigZagLevelOrder{
	Node root = null;
	public static void main(String[] args) {
		ZigZagLevelOrder tree = new ZigZagLevelOrder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(6);
		tree.root.left.left.right = new Node(7);
		tree.root.left.left.left.left = new Node(8);
		tree.root.right.left = new Node(9);
		tree.root.right.right = new Node(10);
	}
	public void zigZagOrder(Node root){
		Queue<Node> queue = new LinkedList<Node>();
		int counter = 1;
		queue.add(root);
		while(!queue.isEmpty()){
			if(counter%2==0){
				Node tempNode = queue.poll(); 
				System.out.print(tempNode.data + " "); 
			}else{

			}
			++counter;
		}
	}
}