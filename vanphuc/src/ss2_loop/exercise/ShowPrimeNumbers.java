package ss2_loop.exercise;

public class ShowPrimeNumbers {
    public static void main(String[] args) {
        System.out.print("Prime Numbers: ");
        int number = 2;
        int count = 0;
        while (count < 20) {
            int divisor = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    divisor++;
                }
            }
            if (divisor ==2) {
                System.out.print(number+" ");
                count++;
            }
            number++;
        }
    }
}
