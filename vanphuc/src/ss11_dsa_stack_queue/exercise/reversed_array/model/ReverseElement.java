package ss11_dsa_stack_queue.exercise.reversed_array.model;


import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void stackStudy() {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap do dai mang: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.printf("nhap phan tu tai [%d]: ", i);
            integerStack.push(scanner.nextInt());
        }
        System.out.print("Mang truoc khi dao nguoc : " + integerStack);

        Stack<Integer> reversedArray = new Stack<>();

        while (!integerStack.isEmpty()) {
            reversedArray.push(integerStack.pop());
        }
        for (int item : reversedArray) {
            integerStack.push(item);
        }
        System.out.print("\n mang sau khi dao nguoc: " + integerStack);
    }

}
