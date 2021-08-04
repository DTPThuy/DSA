package TwoPointer;

public class LinkedListCycle {
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}
	
	public static boolean hasCycle(ListNode head) {
       if(head == null) return false;
       
       ListNode slow = head;
       ListNode fast = head.next;
       
       while(slow != fast) {
    	   if(fast == null || fast.next == null) return false;
    	   
    	   slow = slow.next;
    	   fast = fast.next.next;
       }
       
       return true;
    }
	
	public static void print(ListNode head) {
		while (head != null) {
			System.out.printf("%d ", head.val);
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(0);
		ListNode d = new ListNode(-4);
		
		a.next = b;
		b.next = c;
		c.next = d;
		
		print(a);
		System.out.println(hasCycle(a));

	}

}
