package leetcode;

public class Leetcode70 {
//	You are climbing a stair case. It takes n steps to reach to the top.
//
//	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	//fib number 
	public static int climbStairs(int n) {
        if(n == 1)
            return 1;
        
        int first = 1;
        int second = 2;
        for(int i = 3; i <= n; i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
	//Dynamic Programming
	public static int climbStairs2(int n) {
		if(n == 1)
            return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i-2];
        }
        return dp[n];
    }
	/*
	 * Mathematical Induction
	 * F0 = 1, F1 = 1, F2 = 2, Fn+2 = Fn+1 + Fn
	 * Assume that Fn = a^n
	 * a = (1+-sqrt5)/
	 * Fn = A * a1^n + B * a2^n
	 * F0 = 1, F1 = 1 -> A = ..., B = ...
	 * Fn = 1/sqrt(5) * [(1+sqrt(5))/2 ^(n+1) - (1-sqrt(5))/2 ^(n+1) ]
	 * O(logn)
	 */
	public static int climbStairs3(int n) {
		double sqrt5 = Math.sqrt(5);
		double fibn = Math.pow((1+sqrt5)/2, n+1) - Math.pow((1-sqrt5)/2, n+1);
		return (int)(fibn/sqrt5);
    }
}
