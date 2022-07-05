package ss3_array_study;

import java.util.Scanner;

public class MethodStudy2 {
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*MethodStudy temp = new MethodStudy();*/
        /*int n = temp.inputPositive("n");*/
        int [] array;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap do dai mang: ");
        int length = sc.nextInt();
        array = new int[length];
        for (int i=0;i<array.length;i++){
            System.out.print("nhap phan tu mang tai ["+i+"]: ");
            array[i]= sc.nextInt();
        }
        int count =0;
        for (int item : array){
            if (isPrime(item)){
                count++;
            }
        }
        System.out.println("so luong so nguyen to trong mang: "+ count);
      /*  if (isPrime(n)){
            System.out.println("n la so nguyen to");
        }else {
            System.out.println("n khong phai la do nguyen to");
        }*/
    }
}
