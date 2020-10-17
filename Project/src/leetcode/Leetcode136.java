package leetcode;

public class Leetcode136 {
	public int singleNumber(int[] nums) {
        int a = 0;
        for(int i : nums)
            a ^= i;
        
        return a;
    }
}
