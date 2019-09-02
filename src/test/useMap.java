package test;

import java.util.HashMap;
import java.util.Iterator;

public class useMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Rocky", "90");
        map.put("Sam", "95");
        map.put("Bonny", "100");

        //FOR LOOP
        System.out.println("For Loop:");
        for (HashMap.Entry m : map.entrySet()) {
            System.out.println("Name: "+m.getKey() + " Score: " + m.getValue());
        }

        //WHILE LOOP & ITERATOR
        System.out.println("While Loop:");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry m2 = (HashMap.Entry) iterator.next();
            System.out.println("Name: "+m2.getKey() + " Score : " + m2.getValue());
        }
    }
}