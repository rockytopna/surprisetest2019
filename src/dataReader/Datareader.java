package dataReader;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Datareader {

    public static void main(String[] args) {

        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         *
         * After reading from file using BufferedReader API, store each word into LinkedList & ArrayList
         * Use For Each loop/while loop/Iterator to retrieve data.
         */


        FileReader fr = null;
        BufferedReader br = null;
        String fileName = ("MyFriend.txt");

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);


            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("File was not found");
        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception ex2) {

            }
        }
    }

}








