import java.lang.reflect.Array;

public class Queue<T> {
    DoubleLinkedList<T> dllist;

    public Queue() {
        this.dllist = new DoubleLinkedList<T>();
    }

    public void enqueue(T newElement){
        dllist.append(newElement);
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

        }
        for (int i = 0; i < n; i++) {
            elements[i] = dequeue();
        }
        return elements;
    }

    public void printQueue(){
       dllist.printList();
    }
}
