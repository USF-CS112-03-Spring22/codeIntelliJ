package lecture25LinkedListCont;

/** Class Linked List */
public class LinkedList {
	private Node head;
	private Node tail;
	
	public LinkedList() {
		head = null;
		tail = null;
	}

	public void insertAtFront(int elem) {
		Node newNode = new Node(elem);
		newNode.setNext(head);
		head = newNode;
		if (tail == null) // the list was empty before
		    tail = newNode;

	}

	public void append(int elem) {
        Node newNode = new Node(elem);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /** Prints the elements of the linked list */
    public void print() {
	    Node curr = head;
	    while (curr != null) {
            System.out.print(curr.getElem() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

    public int findNode(int i) {
        Node curr = head;
        int count = 0;
        while (curr != null & count < i) {
            curr = curr.getNext();
            count++;
        }

        if (curr == null) { // no such index
            System.out.println("Invalid index");
            return -1;
            // We could have thrown an exception here
        }
        return curr.getElem();
    }

    public int getFirstValueLargerThan(int number) {
	    // Assume the list is sorted in increasing order
        // Return the first element that is larger than a given number
        Node curr = head;
        while (curr != null && curr.getElem() <= number) {
            curr = curr.getNext();
        }
        if (curr == null) {
            System.out.println("No element in the list is larger than " + number);
            return -1;
        }
        return curr.getElem();
    }

    public void insert(int i, int elem) {
	    // Insert a new node with the given element at the given index
        Node current = head;

        Node newNode = new Node(elem);

        if (i == 0) { // inserting before the head
            newNode.setNext(head);
            head = newNode;
            return;
        }

        int counter = 0;
        while (current != null && counter < i - 1) {

            current = current.getNext();
            counter++;
        }

        // what if current is null
        if (current == null) {
            System.out.println("No such index. Appending to the end of the list.");
            append(elem);
        }
        else {
            // Current is pointing at the node right before the one where we want to insert
            // current is not null, reached i - 1
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    public int remove(Node prevNode) {
        if (prevNode == null || prevNode.getNext() == null) {
            //throw new InvalidArgumentException();
            System.out.println("No node to delete");
            return Integer.MIN_VALUE;
        }
        Node nodeToDelete = prevNode.getNext();
        int deletedElem = nodeToDelete.getElem();
        prevNode.setNext(nodeToDelete.getNext());
        return deletedElem;
    }

    public void findRemove(int elem) {
        // FILL IN CODE: Find and remove the element of the linked list equal to elem
        // Do nothing if such element does not exist

    }

    public int findMiddleElement() {
        // FILL IN CODE: find the middle node and return the element stored at the node

        return 0; // change

    }

    public void insertInOrder(int elem) {
        // FILL IN CODE: insert a new node with the given element into a sorted list
        // so that the list remains sorted
        Node prev = null;
        Node curr = head;
        Node newNode = new Node(elem);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        // FILL IN CODE: the elem is smaller than the head - insert before the head

        // FILL IN CODE: general case - traverse the list, updating prev and curr,
        // and find prev, so that curr.elem > elem
        // Insert elem after prev

        // Make sure your code works when we insert the value larger than the tail
    }


    public int getHeadValue() {
	    return head.getElem();
    }

    public int getTailValue() {
        return tail.getElem();
    }

}
