package com.shariqparwez.linkedlist;

public class LinkedList {

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void insertAtHead(int newData) {
		Node newNode = new Node(newData);

		newNode.setNext(getHead());
		setHead(newNode);
	}

	public void insertAfter(Node prevNode, int newData) {
		if (prevNode == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node newNode = new Node(newData);

		newNode.setNext(prevNode.getNext());
		prevNode.setNext(newNode);
	}

	public void insertAtTail(int newData) {

		Node newNode = new Node(newData);

		if (getHead() == null) {
			setHead(newNode);
			return;
		}

		newNode.setNext(null);

		Node tailNode = getHead();
		while (tailNode.getNext() != null) {
			tailNode = tailNode.getNext();
		}

		tailNode.setNext(newNode);
		return;
	}

	void deleteNode(int key) {
		Node temp = getHead();
		Node prev = null;

		if (temp != null && temp.getData() == key) {
			setHead(temp.getNext());
			return;
		}

		while (temp != null && temp.getData() != key) {
			prev = temp;
			temp = temp.getNext();
		}

		if (temp == null) {
			return;
		}

		prev.setNext(temp.getNext());
	}

	void deleteNodeAtPosition(int position) {
		if (getHead() == null)
			return;

		Node temp = head;

		if (position == 0) {
			setHead(temp.getNext());
			return;
		}

		for (int i = 0; temp != null && i < position - 1; i++) {
			temp = temp.getNext();
		}

		if (temp == null || temp.getNext() == null) {
			return;
		}

		Node next = temp.getNext().getNext();

		temp.setNext(next);
	}

	void deleteList() {
		head = null;
	}

	public int getCount() {
		Node temp = getHead();
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
	}

	public int getCountRec(Node node) {
		if (node == null)
			return 0;

		return 1 + getCountRec(node.getNext());
	}

	public void printList() {
		Node n = getHead();
		while (n != null) {
			System.out.print(n.getData() + " ");
			n = n.getNext();
		}
	}

	public Node swapNodes(int x, int y) {
		Node head = getHead();
		// Nothing to do if x and y are same
		if (x == y)
			return null;

		Node a = null, b = null;

		// search for x and y in the linked list
		// and store their pointer in a and b
		while (head.getNext() != null) {
			if ((head.getNext()).getData() == x) {
				a = head;
			} else if ((head.getNext()).getData() == y) {
				b = head;
			}
			head = head.getNext();
		}

		// if we have found both a and b
		// in the linked list swap current
		// pointer and next pointer of these
		if (a != null && b != null) {
			Node temp = a.getNext();
			a.setNext(b.getNext());
			b.setNext(temp);

			temp = a.getNext().getNext();
			a.getNext().setNext(b.getNext().getNext());
			b.getNext().setNext(temp);
		}
		return head;
	}

	// Checks whether the value x is present in linked list
	public boolean search(int x) {
		Node current = getHead(); // Initialize current
		while (current != null) {
			if (current.getData() == x)
				return true; // data found
			current = current.getNext();
		}
		return false; // data not found
	}

	// Checks whether the value x is present in linked list
	public boolean searchRec(Node head, int x) {
		// Base case
		if (head == null)
			return false;

		// If key is present in current node,
		// return true
		if (head.getData() == x)
			return true;

		// Recur for remaining list
		return searchRec(head.getNext(), x);
	}

	/* Takes index as argument and return data at index */
	public int GetNth(int index) {
		Node current = getHead();
		int count = 0; /*
						 * index of Node we are currently looking at
						 */
		while (current != null) {
			if (count == index)
				return current.getData();
			count++;
			current = current.getNext();
		}

		/*
		 * if we get to this line, the caller was asking for a non-existent element so
		 * we assert fail
		 */
		assert (false);
		return 0;
	}

	/*
	 * Takes head pointer of the linked list and index as arguments and return data
	 * at index
	 */
	public int GetNthRec(Node head, int n) {
		int count = 0;

		// if count equal too n return node.data
		if (count == n)
			return head.getData();

		// recursively decrease n and increase
		// head to next pointer
		return GetNthRec(head.getNext(), n - 1);
	}

	/*
	 * Function to get the nth node from the last of a linked list
	 */
	void printNthFromLast(int n) {
		int len = 0;
		Node temp = getHead();

		// 1) count the number of nodes in Linked List
		while (temp != null) {
			temp = temp.getNext();
			len++;
		}

		// check if value of n is not more than length of
		// the linked list
		if (len < n)
			return;

		temp = head;

		// 2) get the (len-n+1)th node from the begining
		for (int i = 1; i < len - n + 1; i++)
			temp = temp.getNext();

		System.out.println(temp.getData());
	}

	/* Function to print middle of linked list */
	void printMiddle() {
		Node slow_ptr = getHead();
		Node fast_ptr = getHead();
		if (head != null) {
			while (fast_ptr != null && fast_ptr.getNext() != null) {
				fast_ptr = fast_ptr.getNext().getNext();
				slow_ptr = slow_ptr.getNext();
			}
			System.out.println("The middle element is [" + slow_ptr.getData() + "] \n");
		}
	}

	/*
	 * Counts the no. of occurences of a node (search_for) in a linked list (head)
	 */
	int count(int searchFor) {
		Node current = getHead();
		int count = 0;
		while (current != null) {
			if (current.getData() == searchFor)
				count++;
			current = current.getNext();
		}
		return count;
	}

	int detectLoop() {
		Node slow_p = getHead();
		Node fast_p = getHead();
		while (slow_p != null && fast_p != null && fast_p.getNext() != null) {
			slow_p = slow_p.getNext();
			fast_p = fast_p.getNext().getNext();
			if (slow_p == fast_p) {
				System.out.println("Found loop");
				return 1;
			}
		}
		return 0;
	}

	/*
	 * This function detects and counts loop nodes in the list. If loop is not there
	 * in then returns 0
	 */
	public int countNodesinLoop(Node list) {
		Node slow_p = list;
		Node fast_p = list;

		while (slow_p != null && fast_p != null && fast_p.getNext() != null) {
			slow_p = slow_p.getNext();
			fast_p = fast_p.getNext().getNext();

			/*
			 * If slow_p and fast_p meet at some point then there is a loop
			 */
			if (slow_p == fast_p)
				return countNodes(slow_p);
		}

		/* Return 0 to indeciate that ther is no loop */
		return 0;
	}

	// Returns count of nodes present in loop.
	int countNodes(Node n) {
		int res = 1;
		Node temp = n;
		while (temp.getNext() != n) {
			res++;
			temp = temp.getNext();
		}
		return res;
	}

}
