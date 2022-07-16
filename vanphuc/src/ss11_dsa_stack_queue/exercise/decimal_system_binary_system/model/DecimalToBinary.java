package ss11_dsa_stack_queue.exercise.decimal_system_binary_system.model;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    private static Stack<Integer> integerStack = new Stack<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void convert() {
        System.out.print("nhap so muon chuyen: ");
        int decimal = scanner.nextInt();
        System.out.print("ket qua: ");
        while (decimal > 0) {
            integerStack.push(decimal % 2);
            decimal /= 2;
        }
        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop());
        }
    }
}
