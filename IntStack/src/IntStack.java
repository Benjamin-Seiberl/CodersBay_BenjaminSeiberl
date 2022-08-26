public class IntStack {
    private DoubleLinkedList<Integer> dllist;

    public IntStack() {
        this.dllist = new DoubleLinkedList<Integer>();
    }

    public int size() {
        return dllist.getSize();
    }

    public void printStack() {
        dllist.printList();
    }

    public void push(int newElement) {
        dllist.append(newElement);
    }

    public int pop() {
        //todo throwException

        int number = dllist.seekListReverse(0);
        dllist.delete(dllist.getSize() - 1);
        return number;
    }

    public int peek() {
        if (dllist.getSize() == 0) {
            //todo throw exception
        }
        return dllist.seekListReverse(0);
    }

    public int[] pop(int n) {
        if (n > dllist.getSize()) {
            //todo throwException
        } else {
            int[] elements = new int[n];
            for (int i = 0; i < n; i++) {
                elements[i] = pop();
            }
            return elements;
        }
        return new int[0];
    }
}
