package queueProgramProgect;

public class App {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);


        theQueue.arraysCountent();

//        while ( !theQueue.isEmpty()){
//            int n = theQueue.remove();
//            System.out.print(n);
//            System.out.print(" ");
//        }
//        System.out.print(" ");
    }
}
