package com.lab.ds.llist;

import com.lab.ds.llist.ListNode;

public class LinkedListDemo{
	public static void main(String[] args) {
		LinkedListDemo ldemo = new LinkedListDemo();
		ldemo.addNode(1);
		ldemo.addNode(2);
		ldemo.addNode(3);
		ldemo.addNode(4);
	}
	public void addNode(int d){
		ListNode end = new ListNode(d);
		ListNode n = this;
		while(n.next!=null){
			n = n.next;
		}
		n.next = end;
	}
	public void display(ListNode node){
		while(node!=null){
			 System.out.print(node.next+"->");
			node = node.next;
		}
		System.out.print("null\n");
	}

}