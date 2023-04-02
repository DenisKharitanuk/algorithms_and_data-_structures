package Sorts.ObjectsInsertSort;

public class App {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInOb arr;
        arr = new ArrayInOb(maxSize);

        arr.insert("Evans" , "Patty" , 24);
        arr.insert("Denis" , "Kharitanuk" , 29);
        arr.insert("Alex" , "Ger" , 26);
        arr.insert("Sergey" , "Cherep" , 33);
        arr.insert("Piter" , "Grifen" , 55);
        arr.insert("Bonny" , "Klaidovna" , 22);
        arr.insert("Cannibale" , "Corpse" , 30);
        arr.insert("Mat" , "Daimond" , 19);
        arr.insert("Nasta" , "Charitanuk" , 31);


        arr.display();
        arr.insertionSort();
        arr.display();
    }
}
