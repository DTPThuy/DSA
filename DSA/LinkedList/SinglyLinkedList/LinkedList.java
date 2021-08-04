package SinglyLinkedList;

public class LinkedList {
	static class Node {
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	static class MyLinkedList {
		
		private Node head;
		private int size;
		
	    /** Initialize your data structure here. */
	    public MyLinkedList() {
	        this.head = null;
	        this.size = 0;
	    }
	    
	    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	    public int get(int index) {
	        if(index >= size || index < 0) return -1;
	        
	        Node cur = head;
	        for (int i = 0; i < index; i++) {
				cur = cur.next;
			}
	    	return cur.val;
	    }
	    
	    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	    public void addAtHead(int val) {
	        Node pre = new Node(val);
	        pre.next = head;
	        head = pre;//gan head vao new Node
	        size++;
	    }
	    
	    /** Append a node of value val to the last element of the linked list. */
	    public void addAtTail(int val) {
	        Node lastNode = new Node(val);
	        size++;
	        
	        if(head == null) head = lastNode;
	        else {
		        Node cur = head;
		        while (cur.next != null) 
		        	cur = cur.next;
		        cur.next = lastNode;
	        }
	     }
	    
	    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	    public void addAtIndex(int index, int val) {
	        if(index > size) return;
	        if(index == 0) {
	        	addAtHead(val);
	        	return;
	        }
	        if(index == size){
	            addAtTail(val);
	            return;
	        }
	        else {
	        	size++;
	        	Node cur = head;
	        	for (int i = 0; i < index - 1; i++) {
					cur = cur.next;
				}
	        	Node node = new Node(val);
	        	node.next = cur.next;
	        	cur.next = node;
	        }
	        
//	        Node newNode = new Node(val);
//	        Node temp = head;
//	        int counter = 0;
//	        if((index) == size) {
//	            addAtTail(val);
//	            return;
//	        }
//	        if(index > size) {
//	            return;
//	        }
//	        if(index == 0){
//	            addAtHead(val);
//	            return;
//	        }
//	        while(counter != (index -1)) {
//	            temp = temp.next;
//	            counter++;
//	        }
//	        newNode.next = temp.next;
//	        temp.next = newNode;
//	        size++;
	    }
	    
	    /** Delete the index-th node in the linked list, if the index is valid. */
	    public void deleteAtIndex(int index) {
	    	if(index >= size || index < 0 ) return;
	    	size--;
	    	if (index == 0) {
                head = head.next;
                return;
            }
	    	Node cur = head;
	    	for (int i = 0; i < index - 1; i++) {
				cur = cur.next;
			}
	    	cur.next = cur.next.next;
	    }
	}
	/**
	 * Your MyLinkedList object will be instantiated and called as such:
	 * MyLinkedList obj = new MyLinkedList();
	 * int param_1 = obj.get(index);
	 * obj.addAtHead(val);
	 * obj.addAtTail(val);
	 * obj.addAtIndex(index,val);
	 * obj.deleteAtIndex(index);
	 */

	public static void main(String[] args) {
		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(1);
		obj.addAtTail(11);
		obj.addAtIndex(1,14);
		int param_1 = obj.get(1);
		System.out.println(param_1);
		obj.deleteAtIndex(0);
	}

}
