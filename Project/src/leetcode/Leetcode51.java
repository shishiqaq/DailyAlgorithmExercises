package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode51 {
	public List<List<String>> solveNQueens(int n) {
        int queens[] = new int[n];
        //-1 -> empty
        Arrays.fill(queens, -1);
        return solve(queens, 0);
    }
    
    public List<List<String>> solve(int[] queens, int row) {
        List<List<String>> ans = new ArrayList<>();
        if(row == queens.length){
            ans.add(generate(queens));
            return ans;
        }
        for(int col = 0; col < queens.length; col++){
            if(!attack(queens, row, col)){
                queens[row] = col;
                ans.addAll(solve(queens, row+1));
                queens[row] = -1;
            }
        }
        return ans;
    }
    
    public boolean attack(int[] queens, int row, int col){
        for(int currentRow = 0; currentRow < queens.length; currentRow++){
            int currentCol = queens[currentRow];
            if(currentCol == -1)
                continue;
            if(currentRow == row || currentCol == col)
                return true;
            if(currentRow - row == currentCol - col)
                return true;
            if(currentRow + currentCol == row + col)
                return true;
        }
        return false;
    }
    
     private List<String> generate(int[] queens){
        List<String> s = new ArrayList<>();
        for(int row = 0; row < queens.length; row++){
            char[] curr = new char[queens.length];
            Arrays.fill(curr, '.');
            int col = queens[row];
            curr[col] = 'Q';
            s.add(new String(curr));
        }
        return s;
    }
}
