package com.lab.ds.llist;
import java.util.Stack;

class ListNode{
	int val;
	ListNode next;
	public ListNode(int x){
		this.val = x;
	}
}
public class ReverseLinkedList{
	public static void main(String[] args) {
		ReverseLinkedList rlist = new ReverseLinkedList();

		ListNode l1= new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);

		rlist.display(l1);
		rlist.display(rlist.reverseLinkedList(l1));

		rlist.display(rlist.reverseLinkedListWithStack(l1));

	}
	public void display(ListNode node){
		while(node !=null){
			System.out.print(node.val+"->");
			node = node.next;
		}
		System.out.print("null\n");
	}
	public ListNode reverseLinkedList(ListNode l1){
		ListNode prev = null;
		ListNode current  = l1;
		ListNode next = null;
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current =  next;
		}
		return prev;
	}

	public ListNode reverseLinkedListWithStack(ListNode head){
		// Stack to store elements of list  
    	Stack<ListNode > stk = new Stack<ListNode> ();  
    	// Push the elements of list to stack  
   		ListNode ptr = head;  
   		while (ptr.next != null) {  
        	stk.push(ptr);  
       	    ptr = ptr.next;  
    	}  
    	// Pop from stack and replace  
    	// current nodes value'  
    	head = ptr;  
    	while (!stk.isEmpty()) {  
        	ptr.next = stk.peek();  
        	ptr = ptr.next;  
       	    stk.pop();  
    	}  
    	ptr.next = null;  
      
    return head;
	}
}
