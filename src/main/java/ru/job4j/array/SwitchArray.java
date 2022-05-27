package ru.job4j.array;

public class SwitchArray {

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    private static boolean isValidIndex(int[] array, int index) {
        return index > -1 && index < array.length;
    }

    public static int[] swap(int[] array, int source, int dest) {
        if (isValidIndex(array, source) && isValidIndex(array, dest)) {
            int temp = array[source];
            array[source] = array[dest];
            array[dest] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(numbers);
        for (int item : rsl) {
            System.out.println(item);
        }
    }
}
