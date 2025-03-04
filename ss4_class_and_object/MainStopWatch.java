package ss4_class_and_object;

import java.util.Random;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        int size = 10000;
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }

        stopwatch.start();
        selectionSort(arr);
        stopwatch.stop();
        System.out.println("Elapsed time for sorting: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi arr[i] với arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
