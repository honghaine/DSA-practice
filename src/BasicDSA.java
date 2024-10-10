import java.util.HashMap;

public class BasicDSA {

    /**
     * https://leetcode.com/problems/two-sum/
     * https://algo.monster/liteproblems/1
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length < 2) {
            return result;
        }

        HashMap<Integer, Integer> position = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int y = target - nums[i];

            if (position.containsKey(y)) {
                result[0] = position.get(y);
                result[1] = i;
                return result;
            }

            position.put(nums[i], i);
        }
        return result;
    }

    /**
     * 206. Reverse Linked List
     * https://algo.monster/liteproblems/206
     * https://leetcode.com/problems/reverse-linked-list
     */
    
}
