package ss1_java_introduction.exercise;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương có tối đa 3 chữ số: ");
        int number = scanner.nextInt();

        if (number < 10) {
            switch (number) {
                case 0 -> System.out.println("zero");
                case 1 -> System.out.println("one");
                case 2 -> System.out.println("two");
                case 3 -> System.out.println("three");
                case 4 -> System.out.println("four");
                case 5 -> System.out.println("five");
                case 6 -> System.out.println("six");
                case 7 -> System.out.println("seven");
                case 8 -> System.out.println("eight");
                case 9 -> System.out.println("nine");
                default -> System.out.println("out of ability!");
            }
        } else if (number < 20) {
            switch (number % 10) {
                case 0 -> System.out.println("ten");
                case 1 -> System.out.println("eleven");
                case 2 -> System.out.println("twelve");
                case 3 -> System.out.println("thirteen");
                case 4 -> System.out.println("fourteen");
                case 5 -> System.out.println("fifteen");
                case 6 -> System.out.println("sixteen");
                case 7 -> System.out.println("seventeen");
                case 8 -> System.out.println("eighteen");
                case 9 -> System.out.println("nineteen");
                default -> System.out.println("out of ability!");
            }
        } else if (number < 100) {
            switch (number / 10) {
                case 2 -> System.out.print("twenty");
                case 3 -> System.out.print("thirty");
                case 4 -> System.out.print("forty");
                case 5 -> System.out.print("fifty");
                case 6 -> System.out.print("sixty");
                case 7 -> System.out.print("seventy");
                case 8 -> System.out.print("eighty");
                case 9 -> System.out.print("ninety");
                default -> System.out.println("out of ability!");
            }

            if (number % 10 != 0) {
                switch (number % 10) {
                    case 1 -> System.out.println("-one");
                    case 2 -> System.out.println("-two");
                    case 3 -> System.out.println("-three");
                    case 4 -> System.out.println("-four");
                    case 5 -> System.out.println("-five");
                    case 6 -> System.out.println("-six");
                    case 7 -> System.out.println("-seven");
                    case 8 -> System.out.println("-eight");
                    case 9 -> System.out.println("-nine");
                    default -> System.out.println("out of ability!");
                }
            }
        } else if (number < 1000) {
            switch (number / 100) {
                case 1 -> System.out.print("one hundred");
                case 2 -> System.out.print("two hundred");
                case 3 -> System.out.print("three hundred");
                case 4 -> System.out.print("four hundred");
                case 5 -> System.out.print("five hundred");
                case 6 -> System.out.print("six hundred");
                case 7 -> System.out.print("seven hundred");
                case 8 -> System.out.print("eight hundred");
                case 9 -> System.out.print("nine hundred");
                default -> System.out.println("out of ability!");
            }

            int newNumber = number - (number/100)*100;
            if (newNumber != 0) {
                if (newNumber < 10) {
                    switch (newNumber) {
                        case 1 -> System.out.println(" and one");
                        case 2 -> System.out.println(" and two");
                        case 3 -> System.out.println(" and three");
                        case 4 -> System.out.println(" and four");
                        case 5 -> System.out.println(" and five");
                        case 6 -> System.out.println(" and six");
                        case 7 -> System.out.println(" and seven");
                        case 8 -> System.out.println(" and eight");
                        case 9 -> System.out.println(" and nine");
                        default -> System.out.println("out of ability!");
                    }
                } else if (newNumber < 20) {
                    switch (newNumber % 10) {
                        case 0 -> System.out.println(" and ten");
                        case 1 -> System.out.println(" and eleven");
                        case 2 -> System.out.println(" and twelve");
                        case 3 -> System.out.println(" and thirteen");
                        case 4 -> System.out.println(" and fourteen");
                        case 5 -> System.out.println(" and fifteen");
                        case 6 -> System.out.println(" and sixteen");
                        case 7 -> System.out.println(" and seventeen");
                        case 8 -> System.out.println(" and eighteen");
                        case 9 -> System.out.println(" and nineteen");
                        default -> System.out.println("out of ability!");
                    }
                } else if (newNumber < 100) {
                    switch (newNumber / 10) {
                        case 2 -> System.out.print(" and twenty");
                        case 3 -> System.out.print(" and thirty");
                        case 4 -> System.out.print(" and forty");
                        case 5 -> System.out.print(" and fifty");
                        case 6 -> System.out.print(" and sixty");
                        case 7 -> System.out.print(" and seventy");
                        case 8 -> System.out.print(" and eighty");
                        case 9 -> System.out.print(" and ninety");
                        default -> System.out.println("out of ability!");
                    }

                    if (newNumber % 10 != 0) {
                        switch (newNumber % 10) {
                            case 1 -> System.out.println("-one");
                            case 2 -> System.out.println("-two");
                            case 3 -> System.out.println("-three");
                            case 4 -> System.out.println("-four");
                            case 5 -> System.out.println("-five");
                            case 6 -> System.out.println("-six");
                            case 7 -> System.out.println("-seven");
                            case 8 -> System.out.println("-eight");
                            case 9 -> System.out.println("-nine");
                            default -> System.out.println("out of ability!");
                        }
                    }
                }
            }
        }
    }
}
