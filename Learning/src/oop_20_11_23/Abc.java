package oop_20_11_23;

import java.util.Map;
import java.util.TreeMap;

public class Abc {
    public static void main(String[] args) {
        
        Map<String, Integer> myMap = new TreeMap<String, Integer>();

        int i = 0;

        while (i < args.length) {
            if(!myMap.containsKey(args[i].toLowerCase())) {               
                myMap.put(args[i].toLowerCase(), 1);
            } else {
                int oldValue = myMap.get(args[i].toLowerCase());
                myMap.put(args[i].toLowerCase(), oldValue + 1);
            }
            i++;
        }


        for (String key : myMap.keySet()) {
            System.out.println(key + ": " + myMap.get(key));
        }

    }

}
