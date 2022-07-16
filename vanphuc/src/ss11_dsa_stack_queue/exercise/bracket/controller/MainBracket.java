package ss11_dsa_stack_queue.exercise.bracket.controller;

import ss11_dsa_stack_queue.exercise.bracket.model.Bracket;

import java.util.Scanner;

public class MainBracket {
    public static void main(String[] args) {
        Scanner chain = new Scanner(System.in);
        System.out.print("Nap chuoi can xet: ");
        String str = chain.nextLine();
        System.out.println(Bracket.checkBracket(str));
    }
}
