import java.lang.reflect.Array;
import java.util.List;

public class Queue<T> {
    DoubleLinkedList<T> dllist;

    public Queue() {
        this.dllist = new DoubleLinkedList<T>();
    }

    public Queue(T value) {
        this.dllist = new DoubleLinkedList<T>(value);
    }

    public DoubleLinkedList<T> getDllist() {
        return dllist;
    }

    public DoubleLinkedList<T> enqueue(T newElement){
        dllist.append(newElement);
        return dllist;
    }

    public int size(){
        return dllist.getSize();
    }

    public T dequeue(){
        //todo throwException

        T value = dllist.seekList(0);
        dllist.delete(0);
        return value;
    }

    public T[] dequeue(int n){
        //todo throwException

        T[] elements = (T[])new Object[n];
        if (n > dllist.getSize()) {
            return null;
        }
        for (int i = 0; i < n; i++) {
            elements[i] = dequeue();
        }
        return elements;
    }

    public String printQueue(){
        return dllist.printList();
    }
}
