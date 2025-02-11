package VongLapJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int arr[] = new int[5];
//        arr[0] = 1;
//        arr[1] = 5;
//        arr[2] = 8;
//        arr[3] = 12;
//        arr[4] = 2;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for(int item:arr){
//            System.out.print(item + " ");
//        }

        int num;
        do {
            System.out.println("Nhập 1 số: ");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            System.out.println(num);
        }
        while (num != 0);
    }
}
