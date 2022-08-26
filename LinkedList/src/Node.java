public class Node<T> {
    private T value;
    private Node next;

    public Node(T value) {
        this.value = value;
        next = null;
    }

    public T getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    
}
