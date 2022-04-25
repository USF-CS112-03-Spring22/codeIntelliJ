package lecture25LinkedListCont;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.append(1);
        myList.append(8);
        myList.append(14);
        myList.append(20);
        myList.append(22);
        myList.print();
        System.out.println();

        myList.findRemove(14);
        myList.print(); // should not include 14
        myList.findRemove(1);
        myList.print(); // should not include 1

        LinkedList myList2 = new LinkedList();
        myList2.append(1);
        myList2.append(8);
        myList2.append(14);
        myList2.append(20);
        myList2.append(22);
        myList2.print();

        System.out.println(myList2.findMiddleElement()); // 14
        /* int elem = myList.findNode(2);
        System.out.println(elem);
        elem  = myList.findNode(0);
        System.out.println(elem);
        elem  = myList.findNode(4);
        System.out.println(elem);
        elem  = myList.findNode(10); // does not exist
        System.out.println(elem);
        System.out.println();
        System.out.print("First element larger than 2: ");
        System.out.println(myList.getFirstValueLargerThan(2));
        System.out.print("First element larger than 0: ");
        System.out.println(myList.getFirstValueLargerThan(0));
        System.out.print("First element larger than 50: ");
        System.out.println(myList.getFirstValueLargerThan(50));
        */


    }
}
