package Sorts.selectSort;

public class ArraySel {
    private int[] a;
    private int nElems;

    public ArraySel(int max) {
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
    protected void randomNumber(int maxSize){
        for (int i = 0; i < maxSize;i++){
            int n = (int)(java.lang.Math.random()*(maxSize-1));
            insert(n);
        }
    }
    protected void selectSort(){
        int out, in , min;
        for (out=0;out<nElems-1; out++){
            min = out;
            for (in=out+1;in<nElems;in++)
                if(a[in]< a[min])
                    min = in;
                swap(out,min);

        }
    }
    protected void invertSelectSort(){
        int out, in , min;
        for (out=0;out<nElems-1; out++){
            min = out;
            for (in=out+1;in<nElems;in++)
                if(a[in] > a[min])
                    min = in;
            swap(out,min);

        }
    }
    private void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
