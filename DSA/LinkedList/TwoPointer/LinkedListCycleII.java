package TwoPointer;

public class LinkedListCycleII {
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}
	public int checkCycle(ListNode head) {
		if(head == null) return -1;
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while(slow != fast) {
			if(fast == null || fast.next == null) return 0;
			slow = slow.next;
			fast = fast.next.next;
		}
		return 1;
	}
	public ListNode detectCycle(ListNode head) {
		ListNode curr = head;
		
		while(curr != null) {
			int result = checkCycle(curr);
			if(result == -1) return null;
			else if(result == 1) {
				return curr;
			}
			else if(result == 0) {
				curr = curr.next;
			}
		}
	      
		 return null;
	 }
	
	public static void main(String[] args) {

	}

}
