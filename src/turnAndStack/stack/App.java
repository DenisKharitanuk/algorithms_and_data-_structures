package turnAndStack.stack;

public class App {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(50);
        theStack.push(60);
        theStack.push(80);
        theStack.push(70);

        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
            System.out.println(" ");
        }
        System.out.println("");

    }
}
