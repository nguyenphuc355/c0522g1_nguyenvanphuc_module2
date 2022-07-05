package ss3_array_study.exercise;

import java.util.Scanner;

public class CharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap vao chuoi: ");
        String Chain = sc.nextLine();
        
        System.out.print("nhap ky tu can xet: ");
        char character = sc.nextLine().charAt(0);
        
        int count =0;
        for (int i=0;i<Chain.length();i++){
            if ( character == Chain.charAt(i)){
                count++;
            }
        }
        System.out.println("so lan xuat hien cua ky tu  " +character+"  la: "+ count);
    }
}
