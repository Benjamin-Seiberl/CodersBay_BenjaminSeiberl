public class Program {
    public static void main(String[] args) {
        Stack intStack = new Stack();
        intStack.push(5);
        intStack.push(4);
        intStack.push(3);
        intStack.push(2);
        intStack.push(1);
        intStack.printStack();

        System.out.println();
        intStack.pop();
        intStack.printStack();
        System.out.println();

        intStack.pop(2);
        intStack.printStack();

        System.out.println();
        System.out.println(intStack.peek());
    }
}
