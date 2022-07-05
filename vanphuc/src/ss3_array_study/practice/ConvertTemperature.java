package ss3_array_study.practice;

import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsicus;
        int choice;
        do {
            System.out.println("menu.");
            System.out.println("1. Fahrenheit to celsius");
            System.out.println("2. celsius to fahrenheit ");
            System.out.println("0. Exit.");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to celsius "+fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    celsicus = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsicus));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);

    }

}
