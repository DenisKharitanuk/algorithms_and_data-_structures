package turnAndStack.stack;

public class StackX {

    private int maxSize;
    private long[] stackArray;
    private int top;


    public StackX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;

    }

    protected void push(long j) {
        stackArray[++top] = j;
    }

    protected long pop() {
        return stackArray[top--];
    }

    protected long peek() {
        return stackArray[top];
    }

    protected boolean isEmpty() {
        return (top == -1);
    }

    protected boolean isFull() {
        return (top == maxSize - 1);
    }


}
