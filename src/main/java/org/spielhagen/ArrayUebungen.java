package org.spielhagen;

public class ArrayUebungen {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println("Die Summe der Zahlen im Array ist: ");
        System.out.println(arraySum(numbers));
        System.out.println();
        System.out.println("Maximales Element im Array ist: ");
        System.out.println(findArrayMaximum(numbers));
        System.out.println();

        int[] numbers2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Die elementweise der Addition der beiden Arrays ist: ");
        int[] numbers3 = elementwiseArraySum(numbers, numbers2);

        for (Integer number : numbers3) {
            System.out.println(number);
        }

    }
    public static int arraySum(int[] numberArray) {
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        return sum;
    }

    public static int findArrayMaximum(int[] numberArray) {
        int max = numberArray[0];
        for (Integer number : numberArray) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int[] elementwiseArraySum(int[] numberArray1, int[] numberArray2) {
        int[] result = new int[numberArray1.length];
        for (int i = 0; i < numberArray1.length; i++) {
            result[i] = numberArray1[i] + numberArray2[i];
        }
        return result;
    }
}
