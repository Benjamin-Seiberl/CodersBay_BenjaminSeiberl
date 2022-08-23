public class Program {
    public static void main(String[] args) {
        DoubleLinkedList<String> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.append("1");
        doubleLinkedList.append("2");
        doubleLinkedList.append("3");
        doubleLinkedList.append("4");
        doubleLinkedList.add(3, "5");

        doubleLinkedList.printList();
        System.out.println("-----");
        doubleLinkedList.printListReverse();
        System.out.println("-----");
        doubleLinkedList.seekList(3);
        System.out.println("-----");
        doubleLinkedList.seekListReverse(3);
        System.out.println("-----");
        doubleLinkedList.delete(2);
        doubleLinkedList.printList();
    }
}
