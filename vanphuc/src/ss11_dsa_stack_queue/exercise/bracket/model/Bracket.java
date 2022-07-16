package ss11_dsa_stack_queue.exercise.bracket.model;

import java.util.Stack;

public class Bracket {
    public static boolean checkBracket(String chain) {
        Stack<Character> stringStack = new Stack<>();

        for (int i = 0; i < chain.length(); i++) {
            stringStack.push(chain.charAt(i));
        }
        System.out.println(stringStack);

        Stack<Character> newChar = new Stack<>();

        for (int i = 0; i < stringStack.size(); i++) {

            if (stringStack.get(i).equals('(')) {
                newChar.push(stringStack.get(i));

            } else if (stringStack.get(i).equals(')')) {

                if (newChar.isEmpty()) {
                    return false;
                }
                newChar.pop();
            }
        }
        return newChar.isEmpty();
    }
}