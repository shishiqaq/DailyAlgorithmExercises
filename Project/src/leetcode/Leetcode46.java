package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode46 {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        if(nums.length == 0)
            return l;
        List<Integer> list = new ArrayList<>();
        backtracking(l, nums, list);
        return l;
    }
    
    public void backtracking(List<List<Integer>> l, int[] nums, List<Integer> list) {
        if(list.size() == nums.length){
            l.add(new ArrayList(list));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                backtracking(l, nums, list);
                list.remove(list.size()-1);
            }
        }
    }
}
