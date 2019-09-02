package useArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

    /*
     * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
     * Use For Each loop and while loop with Iterator to retrieve data.
     *
     */

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Steve");
        arrayList.add("John");
        arrayList.add("Bonny");
        arrayList.add("Brett");


        System.out.println("Origianl ArrayList:");


        //Add Steve at 3rd positon
        arrayList.add(2, "Steve");

        System.out.println("After adding :" + arrayList);

        System.out.println("**************");

        //Remove Steve

        arrayList.remove("Steve");
        arrayList.remove(1);
        System.out.println("After removing:" + arrayList);

        System.out.println("***************");





        //for loop
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");

        }

            System.out.println(" ");

            //use Iterator

            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());

            }


        }
    }





