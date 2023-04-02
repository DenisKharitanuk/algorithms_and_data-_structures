package Sorts.orderArray;

public class App {
    public static void main(String[] args) {
        int maxSize = 100;
        OrderArray first;
        OrderArray second;
        first = new OrderArray(maxSize);
        second = new OrderArray(maxSize);

        first.insert(91);
        first.insert(82);
        first.insert(73);
        first.insert(64);
        first.insert(55);
        first.insert(46);

        second.insert(37);
        second.insert(28);
        second.insert(19);

        first.merge(first,second);
        first.displayMerge();

//
//
//        arr.display();
//
//        int searchKey = 55;
//        if (arr.find(searchKey) != arr.size())
//            System.out.println("Found" + searchKey);
//        else
//            System.out.println("Can't find" + searchKey);
//        arr.display();
//        arr.delete(00);
//        arr.delete(55);
//        arr.delete(99);
//        arr.display();


    }
}
