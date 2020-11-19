public class myMain {

    public static void main(String[] args) {

        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();

        doubleLinkedList.print();
        doubleLinkedList.pushFront(4);
        doubleLinkedList.pushFront(5);
        doubleLinkedList.pushFront(8);
        doubleLinkedList.insert(7, 1);
        doubleLinkedList.clearList();
        doubleLinkedList.pushFront(4);
        doubleLinkedList.print();

    }
}
