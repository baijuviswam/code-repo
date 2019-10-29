package com.lab.ds.llist;

/** Program to merge two linked lists  rrecursively **/

class ListNode{
	int val;
	ListNode next;
	public ListNode(int x){
		this.val = x;
	}
}
public class MergeLinkedLists{
	public static void main(String[] args) {
		MergeLinkedLists ml = new MergeLinkedLists();

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next= new ListNode(4);

		
		ml.display(l1);


		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(5);
		l2.next.next = new ListNode(7);

		ml.display(l2);

		ml.display(ml.mergeTwoLists(l1,l2));

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
	 	if (l1==null){ 
	 		return l2; 
	 	}else if (l2==null){ 
	 		return l1; 
	 	}else if(l1.val <= l2.val){
	 		l1.next = mergeTwoLists(l1.next, l2);
	 		return l1;
	 	}else{
	 		l2.next = mergeTwoLists(l1, l2.next);
	 		return l2;
	 	}

	}

	public void display(ListNode node){
		while(node!= null){
			System.out.print(node.val+"-->");
			node = node.next;
		}
		System.out.println("null");
	}	

}