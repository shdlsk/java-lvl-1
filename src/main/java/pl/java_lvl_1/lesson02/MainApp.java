package pl.java_lvl_1.lesson02;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        int[] arrayTask1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arrayTask2 = new int[8];

        System.out.println(Arrays.toString(Task1(arrayTask1)));

        System.out.println(Arrays.toString(Task2(arrayTask2)));
    }

    public static int[] Task1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] Task2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        return array;
    }

//    public static void main(String[] args) {
//        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 6) {
//                array[i] = array[i] * 2;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }

    //    public static void main(String[] args) {
//        int[][] array = new int[6][6];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(array));
//    }
//    public static void main(String[] args) {
//        int[] array = new int[]{100, 5, 7, 9, 324, 8, 2, -5};
//        int arrayMax = array[0];
//        int arrayMin = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (arrayMax < array[i]) {
//                arrayMax = array[i];
//            }
//        }
//        System.out.println(arrayMax);
//
//        for (int i = 1; i < array.length; i++) {
//            if (arrayMin > array[i]) {
//                arrayMin = array[i];
//            }
//        }
//        System.out.println(arrayMin);
//    }
}
