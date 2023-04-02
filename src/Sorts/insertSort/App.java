package Sorts.insertSort;

public class App {
    public static void main(String[] args) {
        int maxSize = 10;
        ArrayIns arr;
        arr = new ArrayIns(maxSize);


//        arr.randomNumber(maxSize);
//        arr.display();

        arr.insert(10);
        arr.insert(9);
        arr.insert(8);
        arr.insert(7);
        arr.insert(6);
        arr.insert(5);
        arr.insert(4);
        arr.insert(3);
        arr.insert(2);
        arr.insert(1);
        arr.display();


        arr.insertSort();
        arr.display();

//        arr.noDubs();
//        arr.display();
//
//        arr.deleteZero();
//        arr.display();





    }
}
