package day13;

import java.util.HashMap;
import java.util.Map;

public class Day13_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> countnums = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(countnums.containsKey(target-nums[i])){
                return new int[] {countnums.get(target-nums[i]),i};
            }
            countnums.put(nums[i],i);
        }

        return new int[]{};


    }
}
