package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Leetcode18 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        if(n < 4)
            return new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i < n - 3; i++){
            int pointer = i + 1;
            int left = pointer + 1;
            int right = n - 1;
            while(pointer < n - 2){
                if(nums[i] + nums[pointer] + nums[left] + nums[right] == target){
                    set.add(Arrays.asList(nums[i], nums[pointer], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if(nums[i] + nums[pointer] + nums[left] + nums[right] < target)
                    left++;
                else
                    right--;
                if(left >= right){
                    pointer++;
                    left = pointer + 1;
                    right = n - 1;
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}
