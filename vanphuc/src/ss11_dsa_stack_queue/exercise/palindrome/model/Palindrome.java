package ss11_dsa_stack_queue.exercise.palindrome.model;

import java.util.*;

public class Palindrome {

    public static void checkPalindrome() {
        Stack<Character> stringStack = new Stack<>();
        Queue<Character> characterQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi muon xet: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            stringStack.push(str.charAt(i));
            characterQueue.add(str.charAt(i));
        }
        System.out.println("Mang ban dau: " + stringStack);


        Stack<Character> characterStack = new Stack<>();
        while (!stringStack.isEmpty()) {
            characterStack.push(stringStack.pop());
        }
        System.out.println("Mang Stack: " + characterStack);

        Queue<Character> newCharacterQueue = new LinkedList<>();
        while (!characterQueue.isEmpty()) {
            newCharacterQueue.add(characterQueue.poll());
        }
        System.out.println("Mang Queue: " + newCharacterQueue);

        for (int i = 0; i < characterStack.size(); i++) {
            for (int j = 0; j < newCharacterQueue.size(); j++) {
                if (characterStack.equals(newCharacterQueue)) {
                    System.out.println("la Palindrome");
                } else {
                    System.out.println("khong phai la Palindrome");
                }
                return;
            }
        }
    }

}