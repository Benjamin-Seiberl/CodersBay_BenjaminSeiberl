public class Node<T> {
    private T value;
    private Node previous;
    private Node next;

    public Node(T value) {
        this.value = value;
    }

    public Node() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return value.equals(node.value) && previous.equals(node.previous) && next.equals(node.next);
    }
}
