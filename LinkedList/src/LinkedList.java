public class LinkedList<T> {
    private Node head;

    public void add(T value) {
        if (head == null) {
            head = new Node<T>(value);
        } else {
            Node n = head;
            while (n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(new Node<T>(value));
        }
    }

    public void remove(T value) {
        if (head.getValue() != null && head.getValue().equals(value)) {
            Node n = head.getNext();
            head = null;
            head = n;
        } else {
            Node n = head;
            while (n.getNext() != null) {
                if (n.getNext().getValue().equals(value)) {
                    n.setNext(n.getNext().getNext());
                    n = null;
                    break;
                }
                n = n.getNext();
            }
        }
    }

    public int size() {
        int counter = 0;
        Node n = head;
        while (n != null) {
            n = n.getNext();
            counter++;
        }
        return counter;
    }

    public void printLIst() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getValue());
            n = n.getNext();
        }
        System.out.println();
    }

    public Node get(T value) {
        if(head != null) {
            if (head.getValue().equals(value)) {
                return head;
            } else {
                Node n = head.getNext();
                while (n != null) {
                    if (n.getValue().equals(value)) {
                        return n;
                    }
                    n = n.getNext();
                }
            }
        }
        return new Node<T>(null);
    }


}
