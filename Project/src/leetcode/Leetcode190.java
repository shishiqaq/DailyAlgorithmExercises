package leetcode;

public class Leetcode190 {
	
	public int reverseBits(int n) {
        int rev = 0, power = 31;
        while(power >= 0){
            rev += (n & 1) << power;
            n = n >> 1;
            power--;
        }
        return rev;
    }
}
