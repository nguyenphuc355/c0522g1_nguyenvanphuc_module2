package case_study_2.utils;

import java.util.Scanner;

public class FormatName {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getName() {
        String serviceName = SCANNER.nextLine();
        String[] arr = serviceName.toLowerCase().trim().split("");
        StringBuilder str = new StringBuilder().append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    str.append(arr[i].toUpperCase());
                } else {
                    str.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                str.append(arr[i]);
            }
        }
        return str.toString();
    }
}

