public class Program {


    public static void main(String[] args) {
        Queue<Integer> intQueue = new Queue<>();

        intQueue.enqueue(5);
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);


        intQueue.printQueue();
        System.out.println();

        intQueue.dequeue();

        intQueue.printQueue();
        System.out.println();

        intQueue.dequeue(2);

        intQueue.printQueue();
        System.out.println();

        intQueue.size();


    }
}
