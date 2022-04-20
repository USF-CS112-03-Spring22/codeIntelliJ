package lecture24LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.insertAtFront(5);
        myList.insertAtFront(4);
        myList.insertAtFront(1);
        myList.print();
        System.out.println("head = " + myList.getHeadValue());
        System.out.println("tail = " + myList.getTailValue());

        /*
        myList.append(1);
        myList.append(8);
        myList.append(14);
        myList.append(20);
        myList.append(22);
        //System.out.println("Element at the head = " + myList.getHeadValue());
        //System.out.println("Element at the tail = " + myList.getTailValue());

        myList.print();
        System.out.println();
        */

        /*
        int elem = myList.findNode(2);
        System.out.println(elem);
        elem  = myList.findNode(0);
        System.out.println(elem);
        elem  = myList.findNode(4);
        System.out.println(elem);
        */

        /*
        System.out.println(myList.getFirstValueLargerThan(2));
        System.out.println(myList.getFirstValueLargerThan(0));
        System.out.println(myList.getFirstValueLargerThan(50));
        */
    }
}
