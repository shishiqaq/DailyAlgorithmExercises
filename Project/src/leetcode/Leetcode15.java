package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n < 3)
            return new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        
        for(int i = 0; i < n - 2; i++){
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                if(nums[i] + nums[k] + nums[j] == 0){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(nums[i] + nums[k] + nums[j] < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}
