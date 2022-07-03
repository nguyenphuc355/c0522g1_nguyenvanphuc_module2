package ss2_loop.exercise;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        System.out.print(" Prime Numbers: ");
        for (int i = 0; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            } else {
                System.out.print("");
            }
        }
    }
}
