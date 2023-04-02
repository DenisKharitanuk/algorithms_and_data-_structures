package Sorts.orderArray;

public class OrderArray {
    private int[] a;

    private int mergeArray[];
    private int nElems;


    protected OrderArray(int max) {
        a = new int[max];
        nElems = 0;
    }

    protected int size() {
        return nElems;
    }


    protected int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;

                else
                    upperBound = curIn - 1;
            }
        }
    }

    public void insert(int value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] > value)
                break;
        for (int k = nElems; k > j; k--)
            a[k] = a[k - 1];
        a[j] = value;
        nElems++;
    }

    public int getArrayValueByIndex(int index) {
        return a[index];
    }


    protected boolean delete(int value) {
        int j = find(value);
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems--;
            return true;
        }
    }


    protected void display() {
        for (int j = 0; j < nElems; j++)
            System.out.println(a[j] + " ");
        System.out.println("");
    }


    protected void merge(OrderArray first, OrderArray second) {
        int f = 0;
        int s = 0;
        int arrayLenght = first.size() + second.size();
        mergeArray = new int[arrayLenght];
        for (int j = 0; j < mergeArray.length; j++) {

            if (first.getArrayValueByIndex(f) < second.getArrayValueByIndex(s) && f!=first.size()|| s==second.size()) {
                mergeArray[j] = first.getArrayValueByIndex(f);
                f++;}
            else
            { mergeArray[j] = second.getArrayValueByIndex(s);
            s++;}
        }

    }
    protected void displayMerge() {
        for (int j = 0; j < mergeArray.length; j++)
            System.out.println(mergeArray[j] + " ");
        System.out.println("");
    }


}


