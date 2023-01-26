import java.util.HashMap;

public class repeatedCharacter {

        public static void main(String[] args) {
            String str = "abbtoeelddooeadseltgsf";
            Character nonRepeatedChar = firstNonRepeatedCharacter(str);
            System.out.println("First non-repeated character in " + str + " is: " + nonRepeatedChar);
        }

    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // 1. Create a variable to store the final result and set its initial value to 'null'.

        Character c = null;

        // 2. Create a variable of type 'HashMap' that will store the number of times each character
        // appears in the string.

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        // 4. Iterate through the string again character by character.
        // If a character appears only once in the HashMap,
        // assign that character to the result variable and break the loop.

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.get(ch) == 1) {
                c = ch;
                break;
            }
        }
        // 5. Return the result.
        return c;
    }
}
