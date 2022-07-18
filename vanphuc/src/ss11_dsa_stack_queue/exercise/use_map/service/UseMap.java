package ss11_dsa_stack_queue.exercise.use_map.service;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UseMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi can xet: ");
        String string = scanner.nextLine();
        String[] array;
        array = string.trim().toLowerCase().split(" ");

        Map<String, Integer> treeMap = new TreeMap<>();

        for (String key : array) {
            if (treeMap.containsKey(key)) {

                treeMap.put(key, treeMap.get(key) + 1);

            } else {
                treeMap.put(key, 1);
            }
        }
        System.out.println("So lan xuat hien cua moi tu la");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()){
            System.out.printf("%s-%s\n",entry.getKey(),entry.getValue());
        }
    }
}

