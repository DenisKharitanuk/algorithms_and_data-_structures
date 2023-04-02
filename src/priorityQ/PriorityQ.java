package priorityQ;

public class PriorityQ {

    private int maxSize;
    private int[] queArray;
    private int nItems;

    public PriorityQ(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        nItems = 0;
    }

    protected void insert(int item) {
        int j;
        if (nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item > queArray[j]) {
                    queArray[j + 1] = queArray[j];
                } else
                    break;

            }
            queArray[j + 1] = item;
            nItems++;

        }
    }

    protected long remove() {
        return queArray[--nItems];
    }

    protected int peekMin() {
        return queArray[nItems - 1];
    }

    protected boolean isEmpty(){
        return  (nItems==0);
    }

    protected boolean isFull(){
        return (nItems==maxSize);
    }

}
