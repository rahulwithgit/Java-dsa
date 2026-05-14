// File Name: ValidAnagram.java

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        // HashMap to store:
        // character -> frequency
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            // Increment count for chars in first string
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            // Decrement count for chars in second string
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        // If all counts are zero, strings are anagrams
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "anagram";
        String t1 = "nagaram";

        String s2 = "rat";
        String t2 = "car";

        System.out.println("\"" + s1 + "\" and \"" + t1 + "\": " + isAnagram(s1, t1));
        System.out.println("\"" + s2 + "\" and \"" + t2 + "\": " + isAnagram(s2, t2));
    }
}
