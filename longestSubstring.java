// File Name: LongestSubstring.java

import java.util.HashMap;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        // HashMap to store:
        // character -> latest index
        HashMap<Character, Integer> map = new HashMap<>();

        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {

            char current = s.charAt(end);

            // Move window start if char repeats inside window
            if (map.containsKey(current) && map.get(current) >= start) {
                start = map.get(current) + 1;
            }

            map.put(current, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("\"" + s1 + "\": " + lengthOfLongestSubstring(s1));
        System.out.println("\"" + s2 + "\": " + lengthOfLongestSubstring(s2));
        System.out.println("\"" + s3 + "\": " + lengthOfLongestSubstring(s3));
    }
}
