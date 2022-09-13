public class Stack<T> {
    private DoubleLinkedList<T> dllist;

    public Stack() {
        this.dllist = new DoubleLinkedList<T>();
    }

    public int size() {
        return dllist.getSize();
    }

    public String printStack() {
        return dllist.printList();
    }

    public void push(T newElement) {
        dllist.append(newElement);
    }

    public T pop() {
        //todo throwException

        T number = dllist.seekListReverse(0);
        dllist.delete(dllist.getSize() - 1);
        return number;
    }

    public T[] pop(int n) {
        T[] elements = (T[]) new Object[n];
        if (n > dllist.getSize()) {
            //todo throwException
        } else {
            for (int i = 0; i < n; i++) {
                elements[i] = pop();
            }
            return elements;
        }
        return null;
    }

    public T peek() {
        if (dllist.getSize() == 0) {
            //todo throw exception
        }
        return dllist.seekListReverse(0);
    }
}
