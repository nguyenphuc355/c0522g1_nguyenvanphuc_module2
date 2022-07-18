package ss12_java_collection_frame_work.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
       Map<String, Integer> integerMap = new HashMap<>();
       integerMap.put("Smith",30);
       integerMap.put("Anderson",31);
       integerMap.put("Lewis",29);
       integerMap.put("Cook",29);

        System.out.println("Display entries in HashMap");
        System.out.println(integerMap+"\n");

        Map<String, Integer> integerMap1 = new TreeMap<>(integerMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(integerMap1);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
