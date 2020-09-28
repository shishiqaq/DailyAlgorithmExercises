package leetcode;

public class Leetcode69 {
	public int mySqrt(int x) {
        if(x < 2)
            return x;
        long left = 1, right = x;
        
        while(left < right){
            long mid = left + (right-left) / 2;
            if( mid*mid == x)
                return (int)mid;  
            else if(mid*mid < x)
                left = mid + 1;
            else if(mid*mid > x)
                right = mid;
            
        }
        return (int)(left-1);
    }
}
