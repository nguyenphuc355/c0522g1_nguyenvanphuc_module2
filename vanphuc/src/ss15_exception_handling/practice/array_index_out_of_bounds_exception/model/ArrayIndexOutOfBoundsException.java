package ss15_exception_handling.practice.array_index_out_of_bounds_exception.model;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.print("danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrExample = new ArrayIndexOutOfBoundsException();
        Integer[] array = arrExample.createRandom();
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nnhap chi so phan tu bat ki: ");
        index = scanner.nextInt();
        try {
            System.out.println("gia tri cua phan tu co chi so " + index + " la " + array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("---------Chi so vuot qua gioi han cua mang---------");
        }
    }
}
