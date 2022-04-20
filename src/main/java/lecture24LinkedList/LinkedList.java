package lecture24LinkedList;

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
            System.out.println(curr.getElem());
            curr = curr.getNext();
        }
    }

    public int findNode(int i) {
        Node curr = head;
        int count = 0;
        // FILL IN CODE: find the node with index i and return its value

        return 0; // change
    }

    public int getFirstValueLargerThan(int number) {
	    // Assume the list is sorted in increasing order
        // Return the first element that is larger than a given number
        Node curr = head;
        // FILL IN CODE

        return 0; // change
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

    public int getHeadValue() {
	    return head.getElem();
    }

    public int getTailValue() {
        return tail.getElem();
    }

}
