package SinglyLinkedList;



public class RemoveLLElements {
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
	
	static public ListNode removeElements(ListNode head, int val) {
		if(head == null) return null;

		head.next = removeElements(head.next, val);

        return head.val == val ? head.next : head;
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
		ListNode newList = removeElements(a, 3);
		printLL(newList);

	}

}
