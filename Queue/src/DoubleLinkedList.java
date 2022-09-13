import java.util.List;

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

    public DoubleLinkedList(T value) {
        start = new Node<>("start");
        end = new Node<>("end");
        start.setNext(end);
        start.setPrevious(end);
        end.setNext(start);
        end.setPrevious(start);
        this.append(value);
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

    public String printList() {
        StringBuilder stringBuilder = new StringBuilder();
        Node n = start.getNext();
        while (!n.equals(end)) {
            stringBuilder.append((n.getValue()));
            System.out.println(n.getValue());
            n = n.getNext();
        }
        return stringBuilder.toString();
    }

    public void printListReverse() {
        Node n = end.getPrevious();
        while (!n.equals(start)) {
            System.out.println(n.getValue());
            n = n.getPrevious();
        }
    }

    public T seekList(int index) {
        if (index < size && index >= 0) {
            Node n = start.getNext();
            while (!n.equals(end) && index >= 0) {
                if (index == 0) {
                    return (T) n.getValue();

                }
                n = n.getNext();
                index--;
            }
        }
        return null;
    }

    public T seekListReverse(int index) {
        if (index < size && index >= 0) {
            Node n = end.getPrevious();
            while (!n.equals(start) && index >= 0) {
                if (index == 0) {
                    return (T) n.getValue();
                }
                n = n.getPrevious();
                index--;
            }
        }
        return null;
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
            }
            size--;
        }
    }
}
