package queueProgramProgect;

public class Deque {
    private int maxSize;
    private int[] queArray;
    private int frontRight;
    private int frontLeft;
    private int rear;

    private int nItems;

    private int top;

    public Deque(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        frontLeft = 0;
        frontRight=maxSize-1;
        rear = -1;
        nItems = 0;
        top = maxSize;
    }


    // Left
    protected void insertLeft(int j) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = j;
        nItems++;
    }

    protected int removeLeft() {
        int temp = queArray[frontLeft++];
        if (frontLeft == maxSize) {
            frontLeft = 0;
        }

        nItems--;
        return temp;
    }


    // Right


    protected void insertRight(int j) {
        if (top == 0) {
            top = maxSize ;
        }
        queArray[--top] = j;
        nItems++;
    }

    protected int removeRight() {
        int temp = queArray[frontRight--];
        if (frontRight == -1) {
            frontRight = maxSize-1;
        }
        nItems--;

        return temp;
    }


    protected boolean isEmpty() {
        return (nItems == 0);
    }

    protected boolean isFull() {

        return (nItems == maxSize);
    }
}
