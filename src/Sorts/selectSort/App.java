package Sorts.selectSort;

public class App {
    public static void main(String[] args) {


        int maxSize = 10;
        ArraySel arr;
        arr = new ArraySel(maxSize);

        arr.randomNumber(maxSize);
        arr.display();

        arr.invertSelectSort();
        arr.display();

        arr.selectSort();
        arr.display();

    }
}
