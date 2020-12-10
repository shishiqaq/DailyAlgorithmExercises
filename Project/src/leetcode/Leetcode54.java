package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>  ans = new ArrayList<>();
        if(matrix.length == 0)
            return ans;
        int r1 = 0, r2 = matrix.length;
        int c1 = 0, c2 = matrix[0].length;
        while(r1 < r2 && c1 < c2) {
            for(int c = c1; c < c2; c++)
                ans.add(matrix[r1][c]);
            for(int r = r1+1; r < r2; r++)
                ans.add(matrix[r][c2-1]);
            if(r1 < r2-1 && c1 < c2-1){
                for(int c = c2-2; c > c1; c--)
                    ans.add(matrix[r2-1][c]);
                for(int r = r2-1; r > r1; r--)
                    ans.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ans;
    }
}
