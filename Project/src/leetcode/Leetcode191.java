package leetcode;

public class Leetcode191 {
	
	public int hammingWeight(int n) {
        int nums = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1)
                nums++;
            n >>= 1;
        }
        return nums;
    }
}
