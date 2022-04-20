package lecture24LinkedList;

/** Represents a single node in a linked list */
public class Node {
	private int elem; // value stored at the node
	private Node next; // reference to the next node

	public Node(int elem) {
		this.elem = elem;
		next = null;
	}

	public Node (int elem, Node next) {
		this.elem = elem;
		this.next = next;
	}

	public Node getNext() {
		return next;
	}

	public int getElem() {
		return elem;
	}

	public void setNext(Node next) {
		this.next = next;
	}

    public void setElem(int elem) {
        this.elem = elem;
    }
}
