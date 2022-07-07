package ss4_class_and_object.practice;

public class test {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j + i == 6 || j - i == 5) {
                    System.out.print(i);
                } else if (i - j == 4 || i + j == 15) {
                    System.out.print(10 - i);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
