package turnAndStack.reverse;

public class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top;


    protected StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;

    }

    protected void push(char j) {
        stackArray[++top] = j;
    }

    protected char pop() {
        return stackArray[top--];
    }

    protected char peek() {
        return stackArray[top];
    }

    protected boolean isEmpty() {
        return (top == -1);
    }

    protected boolean isFull() {
        return (top == maxSize - 1);
    }


}
