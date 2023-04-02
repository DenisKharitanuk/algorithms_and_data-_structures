package higArrayJava;

public class HighArray {
   protected int[] a;
    private int nElems;

    protected  HighArray(int max) {
        a = new int[max];
        nElems = 0;
    }
    protected  int getNElems(){
        return nElems;
    }

    protected  boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] == searchKey)
                break;
        if (j == nElems)
            return false;
        else
            return true;
    }

    protected  void insert(int value) {
        a[nElems] = value;
        nElems++;
    }

    protected int removeMax(){
        int maxValue=0;
        if (nElems == 0){return maxValue =-1;
        }
      else {
            for (int i = 0; i < nElems; i++){
                if (a[i]>=maxValue){
                    maxValue=a[i];
                }
            }
            delete(maxValue);
            return maxValue;
        }

    }

    protected  boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (value == a[j])
                break;
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems--;
            return true;
        }
    }


    protected  void display() {
        for (int j = 0; j < nElems; j++)
            System.out.println(a[j] + " ");
        System.out.println("");
    }

    protected void randomNumber(int maxSize){
        for (int i = 0; i < maxSize;i++){
            int n = (int)(java.lang.Math.random()*(maxSize-1));
            insert(n);
        }
    }
     protected void noDubs() {

         for (int i = 0; i < nElems; i++) {
             for (int j = 0 ; j < nElems;j++){
                 if(i!=j){
                     if(a[i]==a[j]){
                         delete(a[j]);
                     }}


             }

         }
     }
}
