public class replaceNth {

    public static void main(String[] args) {
        String text = "The Return of the King is one of the best movies of history";
        int n = 2;
        char old_value = 'o';
        char new_value = 'e';

        String result = replaceNthChar(text, n, old_value, new_value);
        System.out.println(result);
    }

    public static String replaceNthChar(String text, int n, char old_value, char new_value) {
        // Check for invalid inputs
        if (n <= 0 || n > text.length() - text.replace(String.valueOf(old_value), "").length()) {
            return text;
        }

        // Split the text into an array of characters
        char[] chars = text.toCharArray();

        // Loop through the array and replace the nth occurrences of old_value with new_value
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == old_value) {
                count++;
                if (count % n == 0) {
                    chars[i] = new_value;
                }
            }
        }

        // Join the array of characters back into a string and return it
        return new String(chars);
    }
}
