package leetcode;

import java.util.List;

public class Leetcode120 {
	public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] dp = new Integer[triangle.size()][triangle.size()];
        return help(triangle, 0, 0, dp);
    }
    
    public int help(List<List<Integer>> tri, int row, int column, Integer[][] dp) {
        if(row == dp.length-1)
            return tri.get(row).get(column);
        if(dp[row][column] != null)
            return dp[row][column];
        int left = help(tri, row+1, column, dp);
        int right = help(tri, row+1, column+1, dp);
        dp[row][column] = Math.min(left, right) + tri.get(row).get(column);
        return dp[row][column];
    }
}
