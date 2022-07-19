package ss13_searching_algorithm.practice;

import java.util.Scanner;

public class BinarySearch {

  public  static int[] mainBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai mang: ");
        int length = scanner.nextInt();
        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("nhap phan tu tai [%d]: ", i);
            array[i] = scanner.nextInt();
        }
        return array;
    }
    //static int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] array, int key) {

        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
      int [] newArray = mainBinary();
        System.out.println(binarySearch(newArray, 2));
        System.out.println(binarySearch(newArray, 11));
        System.out.println(binarySearch(newArray, 79));
        System.out.println(binarySearch(newArray, 1));
        System.out.println(binarySearch(newArray, 5));
        System.out.println(binarySearch(newArray, 80));
    }
}
