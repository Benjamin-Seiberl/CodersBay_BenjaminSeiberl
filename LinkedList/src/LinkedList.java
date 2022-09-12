public class LinkedList<T> {
    private Node head;

    public LinkedList() {
        this.head = new Node<>(null);
    }

    public void add(T value) {
        if (head == null) {
            head.setNext(new Node<T>(value));
        } else {
            Node n = head;
            while (n.getNext() != null) {
                n = n.getNext();
            }
            Node<T> newNode = new Node<>(value);
            n.setNext(newNode);
        }
    }

    public void remove(T value) {
        if (head != null && head.getValue() != null && head.getValue().equals(value)) {
            Node n = head.getNext();
            head = n;
        } else {
            Node n = head;
            while (n.getNext() != null) {
                if (n.getNext().getValue().equals(value)) {
                    n.setNext(n.getNext().getNext());
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

    public void printList() {
        Node n = head.getNext();
        while (n != null) {
            System.out.println(n.getValue());
            n = n.getNext();
        }
        System.out.println();
    }

    public Node get(T value) {
        if (head == null) {
            return new Node<T>(null);
        }

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

        return new Node<T>(null);
    }

    public Node get(int index){
        if (head == null || index == -1) {
            return null;
        }
        int counter = 0;
        Node n = head;
        while (n != null) {
            if (index == counter) {
                return n;
            }
            counter++;
            n = n.getNext();
        }
        return new Node<T>(null);
    }

    public void reverse(){
        LinkedList<String> tempLL = new LinkedList<>();
        if(head != null){
            Node n = head;
            int size = size()-1;
            for(int i = size; i > 0; i--){
                tempLL.add((String) get(i).getValue());
            }
        }
        this.head.setNext(tempLL.head.getNext());
    }

    public void revers(){
        Node prev = null;
        Node current = head.getNext();
        Node next;
        while(current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head.setNext(prev);
    }


    public void reverseRecursive(){
        reverseRecursive(head.getNext());
    }

    public Node reverseRecursive(Node n){
        if(n.getNext() == null){
            head.setNext(n);
            return n;
        }
        Node first = n;
        Node rest = reverseRecursive(n.getNext());
        rest.setNext(first);
        first.setNext(null);
        return first;
    }
}
