package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ReverseBankTransactions {
    private static int[] array;

    public static void main(String[] args) {
        criticalError();
    }

    private static int[] initializingArray(int[] array) {
        array = new int[]{13, 8, 5, 3, 2, 1, 1};
        return array;
    }

    public static void criticalError() {
        if (initializingArray(array) == null) {
            System.out.println("null (ошибка в данных)");
            return;
        }
        for (int i = 0; i < initializingArray(array).length; i++) {
            if (initializingArray(array)[i] == 0) {
                System.out.println("пустой массив (нет данных)");
                break;
            } else {
                reversArray();
                break;
            }
        }
    }

    private static int[] reversArray() {
        int[] newArray;
        newArray = initializingArray(array);
        System.out.println("Исходные транзакции: " + Arrays.toString(newArray));

        for (int i = 0; i < newArray.length / 2; i++) {
            int temp = newArray[i];
            newArray[i] = newArray[newArray.length - 1 - i];
            newArray[newArray.length - 1 - i] = temp;
        }

        System.out.println(" В обратном порядке: " + Arrays.toString(newArray));
        return newArray;
    }
}
