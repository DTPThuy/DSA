package ClassicProblem;

import java.util.LinkedList;

public class ReverseLinkedLList {
	
	 static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { 
	    	  this.val = val; 
	      }
	      ListNode(int val, ListNode next) { 
	    	  this.val = val; 
	    	  this.next = next; 
	      }
	  }
	
	  public static ListNode reverseList(ListNode head) {
		   
		   ListNode cur = head;
			while(cur != null && cur.next != null) {
				ListNode nextNode = cur.next;
				cur.next = nextNode.next;
				nextNode.next = head;
				head = nextNode;
			}
	    	return head;
	    	
	    	//c2:
	    	//if(head == null || head.next == null) return head;
	    	//ListNode p = reverseList(head.next);
	    	//head.next.next = head;
	    	//head.next = null;
	    	//return p;
	    	 
	   }
	  static void printLL(ListNode head) {
		  while(head != null) {
			  System.out.printf("%d " , head.val);
			  head = head.next;
		  }
		  System.out.println();
	  }
	
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		printLL(a);
		ListNode newList = reverseList(a);
		printLL(newList);

	}

}
