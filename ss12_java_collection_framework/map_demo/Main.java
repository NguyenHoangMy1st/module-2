package ss12_java_collection_framework.map_demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);

        Set<String> keys = customers.keySet();
        for (String key: keys){
            System.out.println("Key: " + key + ": " + customers.get(key));
        }


        System.out.println("--------------------------------");
        System.out.println("Hỗ trợ sắp xếp theo các Entry truyền vào");
        LinkedHashMap<String, Integer> customers1 = new LinkedHashMap<>();
        customers1.put("John", 30);
        customers1.put("Mike", 28);
        customers1.put("Bill", 32);
        customers1.put("Maria", 27);

        Set<String> keys1 = customers1.keySet();
        for (String key: keys1){
            System.out.println("Key: " + key + ": " + customers1.get(key));
        }

        System.out.println("--------------------------------");
        System.out.println("Sắp xếp theo key alpha B");
        TreeMap<String, Integer> customers3 = new TreeMap<>();
        customers3.put("John", 30);
        customers3.put("Mike", 28);
        customers3.put("Bill", 32);
        customers3.put("Maria", 27);

        Set<String> keys3 = customers3.keySet();
        for (String key: keys3){
            System.out.println("Key: " + key + ": " + customers3.get(key));
        }
    }
}