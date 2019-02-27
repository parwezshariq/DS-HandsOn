package com.shariqparwez.linkedlist;

public class LinkedListApp {

	public static void main(String[] args) {
		/*
		 * 1 LinkedList llist = new LinkedList();
		 * 
		 * llist.setHead(new Node(1)); //head Node head = llist.getHead();
		 * 
		 * head.setNext(new Node(2)); Node node2 = head.getNext();
		 * 
		 * node2.setNext(new Node(3)); Node node3 = node2.getNext();
		 * 
		 * llist.printList();
		 */

		/*
		 * 2 Start with the empty list LinkedList llist = new LinkedList();
		 * 
		 * // Insert 6. So linked list becomes 6->NUllist llist.insertAtTail(6);
		 * 
		 * // Insert 7 at the beginning. So linked list becomes // 7->6->NUllist
		 * llist.insertAtHead(7);
		 * 
		 * // Insert 1 at the beginning. So linked list becomes // 1->7->6->NUllist
		 * llist.insertAtHead(1);
		 * 
		 * // Insert 4 at the end. So linked list becomes // 1->7->6->4->NUllist
		 * llist.insertAtTail(4);
		 * 
		 * // Insert 8, after 7. So linked list becomes // 1->7->8->6->4->NUllist
		 * llist.insertAfter(llist.getHead().getNext(), 8);
		 * 
		 * System.out.println("\nCreated Linked list is: "); llist.printList();
		 */

		/*
		 * 3 LinkedList llist = new LinkedList();
		 * 
		 * llist.insertAtHead(7); llist.insertAtHead(1); llist.insertAtHead(3);
		 * llist.insertAtHead(2);
		 * 
		 * System.out.println("\nCreated Linked list is:"); llist.printList();
		 * 
		 * llist.deleteNode(1);
		 * 
		 * System.out.println("\nLinked List after Deletion at node containing 1:");
		 * llist.printList();
		 */

		/*
		 * 4 LinkedList llist = new LinkedList();
		 * 
		 * llist.insertAtHead(7); llist.insertAtHead(1); llist.insertAtHead(3);
		 * llist.insertAtHead(2); llist.insertAtHead(8);
		 * 
		 * System.out.println("\nCreated Linked list is: "); llist.printList();
		 * 
		 * llist.deleteNodeAtPosition(2);
		 * 
		 * System.out.println("\nLinked List after Deletion at position 4: ");
		 * llist.printList();
		 */

		/*
		 * 5 LinkedList llist = new LinkedList(); llist.insertAtHead(1);
		 * llist.insertAtHead(3); llist.insertAtHead(1); llist.insertAtHead(2);
		 * llist.insertAtHead(1);
		 * 
		 * System.out.println("Count of nodes is " + llist.getCount());
		 * System.out.println("Count of nodes through Recursive is " +
		 * llist.getCountRec(llist.getHead()));
		 */

		/*
		 * LinkedList llist = new LinkedList();
		 * 
		 * // The constructed linked list is: // 1.2.3.4.5.6.7 llist.insertAtHead(7);
		 * llist.insertAtHead(6); llist.insertAtHead(5); llist.insertAtHead(4);
		 * llist.insertAtHead(3); llist.insertAtHead(2); llist.insertAtHead(1);
		 * 
		 * System.out.println("Linked list before calling swapNodes() ");
		 * llist.printList(); System.out.println(); llist.swapNodes(3, 6);
		 * 
		 * System.out.println("Linked list after calling swapNodes() ");
		 * llist.printList();
		 */

		/*
		 * LinkedList llist = new LinkedList();
		 * 
		 * Use push() to construct below list 14->21->11->30->10 llist.insertAtHead(10);
		 * llist.insertAtHead(30); llist.insertAtHead(11); llist.insertAtHead(21);
		 * llist.insertAtHead(14);
		 * 
		 * //if (llist.search(22)) if (llist.searchRec(llist.getHead(), 21))
		 * System.out.println("Yes"); else System.out.println("No");
		 */

		/*
		 * LinkedList llist = new LinkedList();
		 * 
		 * Use push() to construct below list 1->12->1->4->1 llist.insertAtHead(1);
		 * llist.insertAtHead(4); llist.insertAtHead(1); llist.insertAtHead(12);
		 * llist.insertAtHead(1);
		 * 
		 * Check the count function llist.printList();
		 * System.out.println("Element at index 3 is "+ llist.GetNth(3)); Check the
		 * count function llist.printList();
		 * System.out.println("Element at index 3 is "+ llist.GetNthRec(llist.getHead(),
		 * 3));
		 */

		/*
		 * LinkedList llist = new LinkedList(); llist.insertAtHead(20);
		 * llist.insertAtHead(4); llist.insertAtHead(15); llist.insertAtHead(35);
		 * 
		 * llist.printNthFromLast(3);
		 */

		/*
		 * LinkedList llist = new LinkedList(); for (int i=5; i>0; --i) {
		 * llist.insertAtHead(i); llist.printList(); llist.printMiddle(); }
		 */

		/*
		 * LinkedList llist = new LinkedList();
		 * 
		 * Use push() to construct below list 1->2->1->3->1 llist.insertAtHead(1);
		 * llist.insertAtHead(2); llist.insertAtHead(1); llist.insertAtHead(3);
		 * llist.insertAtHead(1);
		 * 
		 * Checking count function System.out.println("Count of 1 is "+llist.count(1));
		 */

		/*
		 * LinkedList llist = new LinkedList();
		 * 
		 * llist.insertAtHead(20); llist.insertAtHead(4); llist.insertAtHead(15);
		 * llist.insertAtHead(10);
		 * 
		 * Create loop for testing
		 * llist.getHead().getNext().getNext().getNext().setNext(llist.getHead());
		 * 
		 * llist.detectLoop();
		 */
	    
	    LinkedList llist = new LinkedList();
		llist.insertAtHead(1); 
		llist.insertAtHead(2); 
		llist.insertAtHead(3);
		llist.insertAtHead(4);
		llist.insertAtHead(5);
		//Create loop for testing
		
		llist.getHead().getNext().getNext().getNext().setNext(llist.getHead());
	  
		llist.detectLoop();
	    System.out.println( llist.countNodesinLoop(llist.getHead())); 
		
	}

}
