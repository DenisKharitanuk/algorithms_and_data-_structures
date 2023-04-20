package forSummary;
import java.util.Scanner;

public class CreateAndPrintArray {
    Scanner in = new Scanner(System.in);
    private int[] array;
    private int arrLength;

    public CreateAndPrintArray() {
        consoleInput();
        array = new int[arrLength];
    }

    public void consoleInput() {

        while (!(arrLength > 9) && (arrLength < 100)) {
            System.out.println("Please, enter number more 9 and less 100");

            arrLength = in.nextInt();

        }
        in.close();
    }

    private int randomNumbersGenerator(int min, int max) {
        double randomNubmber = (Math.random() * ((max - min) + 1)) + min;
        return (int) randomNubmber;
    }

    public void createAndDisplayArrayWithRandomNumbers(int minValue, int maxValue) {
        System.out.print("Yor array ");
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumbersGenerator(minValue, maxValue);
            System.out.print(" " + array[i]);
        }

    }

    public void displayArrayWithoutDuplicate() {
        System.out.print("\nArray without duplicates");

        int end = array.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (array[i] == array[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        array[shiftLeft] = array[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        for(int i = 0; i < end; i++){
            whitelist[i] = array[i];
            System.out.print(" " + whitelist[i]);
        }

        System.out.println("\nNumber of unique numbers " + end);
  
    }

}



