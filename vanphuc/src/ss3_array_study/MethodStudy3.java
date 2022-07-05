package ss3_array_study;

public class MethodStudy3 {
    static boolean isPrime2(int n){
        if (n<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MethodStudy temp = new MethodStudy();
        int n = temp.inputPositive("n");
        if (isPrime2(n)){
            System.out.println(n +": la so nguyen to");
        }else {
            System.out.println("n khong phai la so nguyen to");
        }
    }
}
