package leetcode;
import java.util.HashMap;
import java.util.Map;

public class leetcode254 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2};
		int[] B = {-2,-1};
		int[] C = {-1,2};
		int[] D = {0,2};
		System.out.println(fourSumCount(A, B, C, D));
	}
//	A = [ 1, 2]
//	B = [-2,-1]
//	C = [-1, 2]
//	D = [ 0, 2]
	
	public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int a:A) {
        	for(int b:B) {
        		map.put(a+b, map.getOrDefault(a+b, 0) + 1);
        	}
        }
        for(int c:C) {
        	for(int d:D) {
        		if(map.containsKey(-1*(c+d)))
        			count += map.get(-1*(c+d));
        	}
        }
        
        return count;
    }

}
