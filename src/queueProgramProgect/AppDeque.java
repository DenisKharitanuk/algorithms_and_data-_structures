package queueProgramProgect;

public class AppDeque {
    public static void main(String[] args) {
        Deque theDeque = new Deque(6);
        theDeque.insertLeft(1);
        theDeque.insertLeft(2);
        theDeque.insertLeft(3);
        theDeque.insertLeft(4);
        theDeque.insertLeft(5);

        theDeque.removeLeft();
        theDeque.removeLeft();
        theDeque.removeLeft();
        theDeque.removeLeft();

        theDeque.insertLeft(6);
        theDeque.insertLeft(7);
        theDeque.insertLeft(8);


        while ( !theDeque.isEmpty()){
            int n = theDeque.removeRight();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.print(" ");
    }
}
