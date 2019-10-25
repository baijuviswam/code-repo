import java.util.Queue;
import java.util.LinkedList;

public class LevelOrderTraversal{
	Node root;
	public static void main(String[] args) {
		LevelOrderTraversal tree= new LevelOrderTraversal();
		tree.root= new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left= new Node(4);
		tree.root.left.right= new Node(5);
		System.out.println("Level order traversal of binary tree is - "); 
		tree.printLevelOrder(tree.root);
		System.out.println();
	}

	public void printLevelOrder(Node root){
		Queue<Node> queue = new LinkedList<Node>(); 
		queue.add(root); 
		while (!queue.isEmpty()) {
			/* poll() removes the present head. */
			Node tempNode = queue.poll(); 
			System.out.print(tempNode.data + " "); 
			/*Enqueue left child */
            if (tempNode.left != null) { 
                queue.add(tempNode.left); 
            } 
  
            /*Enqueue right child */
            if (tempNode.right != null) { 
                queue.add(tempNode.right); 
            } 
		}

	}

}