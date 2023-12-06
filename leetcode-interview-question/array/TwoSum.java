package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        int diff = 0;
        
        for(int i=0;i<nums.length;i++){
            diff = target - nums[i];
            if(result.containsKey(diff)){
                return new int[] {result.get(diff),i};
            }
            result.put(nums[i],i);
        }
        return null;
    }
}