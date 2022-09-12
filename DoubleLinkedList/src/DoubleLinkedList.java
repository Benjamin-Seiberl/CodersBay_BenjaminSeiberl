public class DoubleLinkedList<T> {
    private Node start;
    private Node end;

    private int size = 0;

    public DoubleLinkedList() {
        start = new Node<>("start");
        end = new Node<>("end");
        start.setNext(end);
        start.setPrevious(end);
        end.setNext(start);
        end.setPrevious(start);
    }

    public int getSize() {
        return size;
    }

    public void append(T value) {
        Node n = new Node<T>(value);
        Node temp = end.getPrevious();

        end.setPrevious(n);
        temp.setNext(n);
        n.setNext(end);
        n.setPrevious(temp);

        size++;
    }

    public void add(int index, T value) {
        if (index < 0) {
            return;
        }

        Node n = start;
        Node newNode = new Node<T>(value);
        if (index > size) {
            append(value);
        } else {
            for (int i = 0; i <= index; i++) {
                n = n.getNext();
            }
            Node previous = n.getPrevious();
            n.setPrevious(newNode);
            previous.setNext(newNode);
            newNode.setNext(n);
            newNode.setPrevious(previous);
            size++;
        }
    }

    public void printList() {
        Node n = start.getNext();
        while (!n.equals(end)) {
            System.out.println(n.getValue());
            n = n.getNext();
        }
    }

    public void printListReverse() {
        Node n = end.getPrevious();
        while (!n.equals(start)) {
            System.out.println(n.getValue());
            n = n.getPrevious();
        }
    }

    public void seekList(int index) {
        if (index < size && index >= 0) {
            Node n = start.getNext();
            while (!n.equals(end) && index >= 0) {
                if (index == 0) {
                    System.out.println(n.getValue());
                }
                n = n.getNext();
                index--;
            }
        }
    }

    public void seekListReverse(int index) {
        if (index < size && index >= 0) {
            Node n = end.getPrevious();
            while (!n.equals(start) && index >= 0) {
                if (index == 0) {
                    System.out.println(n.getValue());
                }
                n = n.getPrevious();
                index--;
            }
        }
    }

    public void delete(int index) {
        if (index < size && index >= 0) {
            Node n = start.getNext();
            while (!n.equals(end)) {
                if (index == 0) {
                    Node previous = n.getPrevious();
                    previous.setNext(n.getNext());
                    n.getNext().setPrevious(previous);
                    n = null;
                    break;
                }
                n = n.getNext();
                index--;
                size--;
            }
        }
    }
}
