package infixNumber;

public class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top;


    public StackX(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    protected void push(char j) {
        stackArray[++top] = j;

    }

    protected int pop() {
        return stackArray[top--];
    }

    protected int peek() {
        return stackArray[top];
    }

    protected boolean isEmpty() {
        return (top == -1);
    }
    protected int size() {
        return top + 1;
    }

    protected int peekN(int n) {
        return stackArray[n];
    }
    protected  void desplayStack(String s){

        System.out.print(s);
        System.out.print("Stack (bottom -->top): " );
        for (int j = 0 ; j<size(); j++){
            System.out.print(peekN(j));
            System.out.print(' ');

        }
        System.out.println("");

    }
}
