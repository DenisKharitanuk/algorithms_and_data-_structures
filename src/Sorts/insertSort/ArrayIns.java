package Sorts.insertSort;

public class ArrayIns {
    private int[] a;
    private int nElems;

    public ArrayIns(int max) {
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

    protected void randomNumber(int maxSize) {
        for (int i = 0; i < maxSize; i++) {
            int n = (int) (java.lang.Math.random() * (maxSize - 1));
            insert(n);
        }
    }


    protected void insertSort() {
        int out, in;
        int copy=0;
        int comporation=0;
        for (out = 1; out < nElems; out++) {
            int temp = a[out];
            in = out;
            copy++;
            comporation++;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                --in;
                copy++;
                comporation++;
            }
            a[in] = temp;
            comporation++;



        }
        System.out.println("Сравнений "+comporation+ " Вставок "+copy);
    }


        protected void noDubs () {

            for (int i = 0; i < nElems; i++) {
                for (int j = 0; j < nElems; j++) {
                    if (i != j) {
                        if (a[i] == a[j]) {
                            a[i] = 0;
                        }
                    }

                }

            }
        }

        protected void deleteZero(){
        for (int i = 1 ; i<nElems;i++){
            if(a[i]==0){
                for (int j=i+1;j<nElems;j++){
                    if(a[j]>0){
                        a[i]=a[j];
                        a[j]=0;
                        break;
                    }

                }

            }
        }
        }


        protected void median () {
            double median = 0;
            if (a.length % 2 != 0) {
                for (int i = 0; i <= a.length / 2; i++) {
                    if (a[i] > median) {
                        median = a[i];
                    }
                }
            }
            if (a.length % 2 == 0) {
                double c = a[(nElems - 1) / 2];
                double b = a[nElems / 2];
                median = (c + b) / 2;
            }


            System.out.println(median);
        }


        protected void invertInsertSort () {
            int out, in;
            for (out = nElems - 2; out >= 0; --out) {
                int temp = a[out];
                in = out;
                while (in < nElems - 1 && a[in + 1] >= temp) {
                    a[in] = a[in + 1];
                    ++in;
                }
                a[in] = temp;
            }
        }

    }
