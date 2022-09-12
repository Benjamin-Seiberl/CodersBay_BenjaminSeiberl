public class Program {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();

        doubleLinkedList.append(0);
        doubleLinkedList.append(1);
        doubleLinkedList.append(2);
        doubleLinkedList.append(3);

        doubleLinkedList.printList();
        doubleLinkedList.printList();

        doubleLinkedList.delete(doubleLinkedList.getSize() - 1);

        doubleLinkedList.printList();

//        doubleLinkedList.append("1");
//        doubleLinkedList.append("2");
//        doubleLinkedList.append("3");
//        doubleLinkedList.append("4");
//        doubleLinkedList.printList();
//        System.out.println();
//        doubleLinkedList.add(-1, "0");
//        doubleLinkedList.add(3, "5");
//
//        doubleLinkedList.printList();
//        System.out.println("-----");
//        doubleLinkedList.printListReverse();
//        System.out.println("-----");
//        doubleLinkedList.seekList(2);
//        System.out.println("-----");
//        doubleLinkedList.seekListReverse(3);
//        System.out.println("-----");
//        doubleLinkedList.delete(3);
//        doubleLinkedList.printList();
    }
}
