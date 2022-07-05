package ss3_array_study.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("nhap vao array [" + i + "]: ");
            array[i] = sc.nextInt();
        }
        System.out.print("mang vua tao: ");
        System.out.println(Arrays.toString(array));

        int[] newArray = new int[size + 1];

        System.out.print("nhap so can chen vao: ");
        int x = sc.nextInt();
        int index = 0;

        do {
            System.out.println("nhap vi tri can chen vao: ");
            index = sc.nextInt();
            if (index <= -1 || index > array.length - 1) {
                System.out.println(" khong chen duoc phan tư vao mang!, xin nhap lai");
            }
        } while (index <= -1 || index > array.length - 1);

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        newArray[index] = x;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }

        System.out.print("mang sau khi chen: ");
        System.out.println(Arrays.toString(newArray));
    }
}
