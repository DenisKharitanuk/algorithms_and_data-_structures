package higArrayJava;

public class App {
    public static void main(String[] args) {
        int maxSize=100;
        int orderArray[];
        HighArray arr;
        arr = new HighArray(maxSize);
        arr.insert(99);
        arr.insert(99);
        arr.insert(99);
        arr.insert(50);
        arr.insert(11);
        arr.insert(4);
        arr.insert(88);
        arr.insert(5);
        arr.insert(5);
        arr.insert(9);
        arr.insert(9);

        arr.noDubs();

        arr.display();


//        int searchKey = 35;
//        if(arr.find(searchKey))
//            System.out.println("Found" + searchKey);
//        else
//            System.out.println("Can't find" + searchKey);
//
//        arr.delete(00);
//        arr.delete(55);
//        arr.delete(99);
//        System.out.println("Max value is " + arr.removeMax());
//        arr.display();
//
//        Sorts.orderArray = new int[arr.getNElems()];
//
//        for ( int i = arr.getNElems(); i > 0 ; i--){
//            Sorts.orderArray[i-1] =  arr.removeMax();
//
//        }
//
//        for (int a = 0;a < Sorts.orderArray.length;a++) {
//            System.out.println(Sorts.orderArray[a]);
//        }


    }
}
