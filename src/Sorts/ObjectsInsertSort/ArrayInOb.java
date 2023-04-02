package Sorts.ObjectsInsertSort;


public class ArrayInOb {
    private Pearson[] a;
    private int nElems;

    protected ArrayInOb(int max) {
        a = new Pearson[max];
        nElems = 0;
    }

    protected void insert (String last, String first , int age){
        a[nElems] = new Pearson(last,first,age);
        nElems++;
    }

    protected void display(){
        for (int i = 0 ; i<nElems;i++)
            a[i].displayPearson();
        System.out.println("");
    }

    protected void insertionSort(){
        int in , out;
        for (out = 1;out<nElems; out++){
            Pearson temp= a[out];
            in = out;
            while (in>0 && a[in-1].getLast().compareTo(temp.getLast())>0){
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
    }
}
