/**
 * Java 1. Home work 3
 *
 * @author Dykin Artur
 * @version 15.09.2021
 */

import java.util.Arrays;
import java.util.Scanner;

class HomeWork3 {

    public static void main(String[] args){
        arrayWithDigits();
        emptyArray();
        arrayOfNumbersBySix();
        diagonalInArrays();
        arrayIntroducedPaws();
    }

/* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */

    static void arrayWithDigits(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] += 1;
            else arr[i] -= 1;
        }
        System.out.println(Arrays.toString(arr));
    }

/* 2. Задать пустой целочисленный массив длиной 100.
С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */

    static void emptyArray(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; arr[i] = i + 1, i++) ;
        System.out.println(Arrays.toString(arr));
    }

/* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
и числа меньшие 6 умножить на 2;
 */

    static void arrayOfNumbersBySix(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }

/* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */

    static void diagonalInArrays(){
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i] = 1;
            arr[i][4 - i - 1] = 1;
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < 4; i++)
            System.out.println(Arrays.toString(arr[i]));
    }

/* 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
 и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
 */

    static void arrayIntroducedPaws(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение для длины массива");
        int len = scanner.nextInt();
        System.out.println("Введите значение для массива");
        int initialValue = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; arr[i] = initialValue, i++) ;
        System.out.println(Arrays.toString(arr));
    }
}
