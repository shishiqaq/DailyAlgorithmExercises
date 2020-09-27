package leetcode;

public class Leetcode66 {
	public int[] plusOne(int[] digits) {
        int c = 1;
        
        for(int i = digits.length - 1; i >= 0; i--){
            int num = c + digits[i];
            digits[i] = (c + digits[i]) %10;
            c = num / 10;
        }
        if(c > 0){
            int[] nums = new int[digits.length + 1];
            nums[0] = 1;
            for(int i = 1; i < nums.length; i++){
                nums[i] = digits[i-1];
            }
            return nums;
        }
        return digits;
    }
}
