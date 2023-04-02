package Sorts.bubleSort;

public class App {
    public static void main(String[] args) {


        int maxSize = 9;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);
        arr.randomNumber(maxSize);
        arr.display();
//        arr.invertBubbleSort();
//        arr.display();
//        arr.bubbleSort();
//        arr.display();

        arr.evenOddSort();
        arr.display();


    }
}
