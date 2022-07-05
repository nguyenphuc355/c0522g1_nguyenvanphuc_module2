package ss3_array_study.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang: ");
        String input = scanner.nextLine();
        String[] arr = new String[Integer.parseInt(input)];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhap phan tu arr [" + i + "] : ");
            arr[i] = scanner.nextLine();
        }
        System.out.print("mang vua tao: ");
        System.out.println(Arrays.toString(arr));

        System.out.print("nhap ten muon tim: ");
        String name = scanner.nextLine();
        boolean isExist=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                System.out.print("vi tri cua " + name + " trong danh sach la " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
                System.out.println("khong tim thay ten trong danh sach!");
        }
    }
}
