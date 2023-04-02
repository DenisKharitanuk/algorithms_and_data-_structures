package Sorts.bubleSort;

public class ArrayBub {
    private int[] a;
    private int nElems;

    public ArrayBub(int max) {
        a = new int[max];
        nElems = 0;
    }


    protected void insert(int value) {
        a[nElems] = value;
        nElems++;
    }


    protected void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    protected void bubbleSort() {
        int out, in, left;
        int i = 1;
        for (out = nElems - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1])
                    swap(in, in + 1);
            }
            for (left = nElems - 2; left >= i; left--) {
                if (a[left] < a[left - 1])
                    swap(left, left - 1);
            }
            ++i;
        }
    }

    protected void evenOddSort() {
        int swapInt;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j = j + 2) {
                if (a[j] > a[j + 1]) {
                    swapInt = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swapInt;
                }
            }
            for (int j = 1; j < a.length - 1; j = j + 2) {
                if (a[j] > a[j + 1]) {
                    swapInt = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swapInt;
                }
            }
        }


    }

    protected void invertBubbleSort() {
        int out, in;
        for (out = 0; out < nElems; out++) {
            for (in = out; in > 0; in--) {
                if (a[in] > a[in - 1])
                    swap(in, in - 1);
            }
        }
    }

    protected void randomNumber(int maxSize) {
        for (int i = 0; i < maxSize; i++) {
            int n = (int) (java.lang.Math.random() * (maxSize - 1));
            insert(n);
        }
    }


    private void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
