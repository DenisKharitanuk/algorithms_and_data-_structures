package infix;

import com.sun.scenario.effect.impl.state.AccessHelper;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;


    public StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = 1;
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
    protected int size() {
        return top + 1;
    }

    protected char peekN(int n) {
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
