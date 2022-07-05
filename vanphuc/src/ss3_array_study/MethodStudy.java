package ss3_array_study;

import java.util.Scanner;

public class MethodStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MethodStudy temp = new MethodStudy();
        int a = temp.inputPositive("a");
        int b = temp.inputPositive("b");
        int c = temp.inputPositive("c");
        long factorialA = temp.calculateFactorial(a);
        long factorialB = temp.calculateFactorial(b);
        long factorialC = temp.calculateFactorial(c);
        long sum = factorialA + factorialB + factorialC;
        System.out.printf("S = %d! + %d! + %d! = %d", a, b, c, sum);
    }

    long calculateFactorial(int a) {
        long factorialA = 1;
        for (int i = 2; i <= a; i++) {
            factorialA *= i;
        }
        return factorialA;
    }

    int inputPositive(String target) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean isInvalidN;
        do {
            System.out.printf("nhap vao %s: ", target);
            n = sc.nextInt();
            isInvalidN = n < 0;
            if (isInvalidN) {
                System.out.printf("%s>=0, cin liem tra lai!!\n", target);
            }
        } while (isInvalidN);
        return n;
    }
}
