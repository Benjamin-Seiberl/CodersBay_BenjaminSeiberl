public class Program {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("First");
        llist.add("Second");
        llist.add("Third");
        llist.add("Fourth");

        llist.printLIst();
        System.out.println(llist.size() + "\n");

        llist.remove("First");
        llist.printLIst();
        llist.remove("Third");
        llist.printLIst();
        llist.remove("Fourth");
        llist.printLIst();
        llist.remove("Second");
        llist.printLIst();

        System.out.println(llist.size() + "\n");

        System.out.println(llist.get("Third").getValue());
    }
}
