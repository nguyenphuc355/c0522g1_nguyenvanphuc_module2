package ss13_searching_algorithm.exercise.longest_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String string = scanner.nextLine();

        List<Character> maxString = new ArrayList<>();
        List<Character> tempString = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            tempString.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > tempString.get(tempString.size() - 1)) {
                    tempString.add(string.charAt(j));
                }
            }

            if (tempString.size() > maxString.size()) {
                maxString.clear();
                maxString.addAll(tempString);
            }

            tempString.clear();
        }

        System.out.println("Chuoi tang dan lon nhat: ");
        for (Character character : maxString) {
            System.out.print(character);
        }
    }
}
