package ss15_exception_handling.practice.number_format_exception.model;


public class NumberFormatException {
    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong x + y = " + a);
            System.out.println("Tong x - y = " + b);
            System.out.println("Tong x * y = " + c);
            System.out.println("Tong x / y = " + d);
        } catch (Exception e) {
            System.out.println("xay ra ngoai le: " + e.getMessage());

        }
    }
}
