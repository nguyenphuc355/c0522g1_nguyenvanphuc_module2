package ss11_dsa_stack_queue.exercise.reversed_array.model;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void chain() {
        Stack<Character> characterStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi bat ky: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            characterStack.push(str.charAt(i));
        }
        System.out.println("mang truoc khi dao nguoc: " + characterStack);

        Stack<Character> reverseString = new Stack<>();

        while (!characterStack.isEmpty()) {
            reverseString.push(characterStack.pop());
        }
        for (Character temp : reverseString) {
            characterStack.push(temp);
        }
        System.out.println("Mang sau khi dao nguoc: " + characterStack);
    }
}
