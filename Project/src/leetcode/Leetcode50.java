package leetcode;

public class Leetcode50 {
	public double myPow(double x, int n) {
        int sign = n < 0 ? -1 : 1;
        double result = myPow2(x, n * sign);
        return sign == -1 ? 1/result : result;
    }
    
    public double myPow2(double x, int n){
        if(n == 1)
            return x;
        if(n == 0)
            return 1;
        double result = myPow2(x, n/2);
        return result * result * (n % 2 == 0 ? 1 : x);
    }
}
