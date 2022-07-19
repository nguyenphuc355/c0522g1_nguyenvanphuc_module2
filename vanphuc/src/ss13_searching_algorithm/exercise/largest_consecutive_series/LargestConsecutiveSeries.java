package ss13_searching_algorithm.exercise.largest_consecutive_series;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestConsecutiveSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ki: ");
        String string = scanner.nextLine();

        List<Character> maxString = new ArrayList<>();
        List<Character> tempString = new ArrayList<>();

        tempString.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) <= string.charAt(i - 1)) {
                tempString.clear();
            }

            tempString.add(string.charAt(i));

            if (tempString.size() > maxString.size()) {
                maxString.clear();
                maxString.addAll(tempString);
            }
        }

        System.out.println("Chuoi lien tiep co do dai lon nhat: ");
        for (Character character : maxString) {
            System.out.print(character);
        }
    }
}
