package com.lab.ds.lc;

import com.lab.ds.lc.ListNode;

/**

Leetcode #19 Remove Nth Node From End of List

Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up: Could you do this in one pass?

**/


class ListNode{
	ListNode next;
	int val;
	public ListNode(int x){
		this.val = x;
	}
}

public class RemoveNthNodeFromEnd{
	public static void main(String[] args) {
		RemoveNthNodeFromEnd  rne = new RemoveNthNodeFromEnd();
		 ListNode l1 = new ListNode(1);
		 l1.next = new ListNode(2);
		 l1.next.next = new ListNode(3);
		 l1.next.next.next= new ListNode(4);
		 l1.next.next.next.next = new ListNode(5);
		 rne.display(l1);
		 rne.display(rne.removeNthFromEnd(l1,5));
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		//create a dummy node
		ListNode dummy = new ListNode(0);
		//point dummy node to head 
		dummy.next=head;
		//define two pointers
		ListNode first = dummy;
		ListNode second = dummy;
		// Advances first pointer so that the gap between first and second is n nodes apart
		for(int i=1; i<=n+1; i++){
			first = first.next;
		}
		// Move first to the end, maintaining the gap
		while(first!=null){
			first=first.next;
			second = second.next;
		}
		second.next=second.next.next;
		return dummy.next;
	}
	public void display(ListNode node){
		while(node!=null){
			System.out.print(node.val+"-->");
			node = node.next;
		}
		System.out.println("null\n");
	}
}