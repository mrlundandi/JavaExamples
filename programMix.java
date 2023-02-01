import java.io.*;
import java.util.*;

public class programMix {
    //Main method to run the program
    public static void main(String[] args) {
        //Input stream to read input from the console
        InputStream inputStream = System.in;
        //Print stream to write output to the console
        PrintStream printStream = System.out;
        //Map to store characters as keys and their frequency as values
        HashMap<String, Integer> map = new HashMap<>();
        //List to store all characters in the input
        List<String> list = new ArrayList<>();

        try {
            //Reading the first character from the input
            int i = inputStream.read();
            //Reading characters one by one until end of input
            while (i != -1) {
                //Converting the int value to character
                char c = (char) i;
                //Converting the character to string
                String s = Character.toString(c);
                //If the character is already in the map, increment its frequency
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    //Otherwise, add the character to the map with frequency 1
                    map.put(s, 1);
                }
                //Adding the character to the list
                list.add(s);
                //Reading the next character
                i = inputStream.read();
            }
        } catch (IOException e) {
            //Printing the stack trace of the exception
            e.printStackTrace();
        }
        //Printing the frequency of each character
        for (String key : map.keySet()) {
            printStream.println(key + ": " + map.get(key));
        }
        //Printing all characters in the input
        for (String s : list) {
            printStream.print(s);
        }
    }
}