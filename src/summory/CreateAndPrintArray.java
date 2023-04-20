package summory;

import java.util.Scanner;

public class CreateAndPrintArray {
    Scanner in = new Scanner(System.in);
    private double[][] array;
    private int arrLength;

    protected CreateAndPrintArray() {
        consoleInput();
        array = new double[arrLength][arrLength];
    }

    protected void consoleInput() {

        while (!(arrLength >= 3) || (arrLength % 2 == 0)) {
            System.out.println("Please, enter an odd number greater than or equal to 3");

            arrLength = in.nextInt();

        }
        in.close();
    }

    private double randomNumbersGenerator(double min, double max) {
        double randomNubmber = (Math.random() *
                (max - min)) + min;
        double scale = Math.pow(10, 2);
        double result = Math.ceil(randomNubmber * scale) / scale;
        return result;
    }

    public void createAndDisplayArrayWithRandomNumbers(double minValue, double maxValue) {
        System.out.print("Your array \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                array[i][j] = randomNumbersGenerator(minValue, maxValue);

                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void lookingForAndDisplayMinimumSideDiagonalElement() {
        int secondaryCounter=0;
        double minNumber=array[0][0];
        for (int i = arrLength-1; i >= 0; i--){

            if((array[i][secondaryCounter]<minNumber) && (i==secondaryCounter) ){
                minNumber=array[i][secondaryCounter];
            }
            secondaryCounter++;

        }
        System.out.println("Minimum side diagonal element is " + minNumber);


    }


}



