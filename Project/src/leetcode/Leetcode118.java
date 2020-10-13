package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode118 {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<List<Integer>>();
        if(numRows == 0)
            return tri;
        List<Integer> first = new ArrayList<>();
        first.add(1);
        tri.add(first);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> pre = tri.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            
            for(int j = 1; j < i; j++){
                curr.add(pre.get(j-1) + pre.get(j));
            }
            curr.add(1);
            tri.add(curr);
        }
        
        return tri;
    }
}
