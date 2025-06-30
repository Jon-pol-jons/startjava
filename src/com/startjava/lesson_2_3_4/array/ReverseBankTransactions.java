package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ReverseBankTransactions {
    public static void main(String[] args) {
        int[] reversed;

        int[] array1 = null;
        reversed = errorCheckingAndReverse(array1);
        result(reversed, array1);

        int[] array2 = new int[10];
        reversed = errorCheckingAndReverse(array2);
        result(reversed, array2);

        int[] array3 = new int[]{5};
        reversed = errorCheckingAndReverse(array3);
        result(reversed, array3);

        int[] array4 = new int[]{6, 8, 9, 1};
        reversed = errorCheckingAndReverse(array4);
        result(reversed, array4);

        int[] array5 = new int[]{13, 8, 5, 3, 2, 1, 1};
        reversed = errorCheckingAndReverse(array5);
        result(reversed, array5);
    }

    private static int[] errorCheckingAndReverse(int[] newArray) {
        if (newArray == null) {
            System.out.println("null (ошибка в данных)");
            return new int[]{0};
        }
        int length = newArray.length;
        for (int i = 0; i < length; i++) {
            if (newArray[i] == 0) {
                System.out.println("пустой массив (нет данных)");
                return new int[]{0};
            } else if (length == 1) {
                System.out.println(newArray[i]);
                return new int[]{0};
            } else {
                System.out.println("Исходные транзакции: " + Arrays.toString(newArray));
                for (int j = 0; j < length / 2; j++) {
                    int temp = newArray[j];
                    newArray[j] = newArray[length - 1 - j];
                    newArray[length - 1 - j] = temp;
                }
                break;
            }
        }
        return newArray;
    }

    private static void result(int[] revers, int[] newArray) {
        for (int i : revers) {
            if (revers[i] != 0) {
                System.out.println(" В обратном порядке: " + Arrays.toString(revers));
                break;
            }
        }
    }
}
