package leetcode;

public class Leetcode70 {
//	You are climbing a stair case. It takes n steps to reach to the top.
//
//	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
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
	public static int climbStairs2(int n) {
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
}
