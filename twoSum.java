// File Name: TwoSum.java

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // HashMap to store:
        // number -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Find complement
            int required = target - nums[i];

            // Check if complement already exists
            if (map.containsKey(required)) {

                return new int[] { map.get(required), i };
            }

            // Store current number and index
            map.put(nums[i], i);
        }

        // If no solution found
        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}