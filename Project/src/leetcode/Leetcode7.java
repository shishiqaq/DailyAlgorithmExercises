package leetcode;

public class Leetcode7 {
	public int reverse(int x) {
        int result = 0;
        while(x != 0){
            int lastDigit = x % 10;
            int next = result * 10 + lastDigit;
            if((next - lastDigit) / 10 != result)//overflow
                return 0;
            result = next;
            x /= 10;
        }
        return result;
    }
	
	public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            /* int: [-2^31, 2^31 - 1]
             * last digit 2 4 8 6   31 % 4 = 3
             * last digit of 2^31 is 8
             * so * 10 + 8 will overflow
             */ 
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
