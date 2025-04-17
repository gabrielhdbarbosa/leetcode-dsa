import java.util.Hashmap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashmap<Integer, Integer> map = new Hashmap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
