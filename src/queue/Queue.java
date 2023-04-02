package queue;

public class Queue {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    protected void insert(int j) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
            queArray[++rear] = j;
            nItems++;

    }

    protected int remove() {
        int temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    protected int peakFront() {
        return queArray[front];
    }

    protected boolean isEmpty() {
        return (nItems == 0);
    }

    protected boolean isFull() {
        return (nItems == maxSize);
    }

    protected int size() {
        return nItems;
    }

}


