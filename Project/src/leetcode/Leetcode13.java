package leetcode;

import java.util.Map;

public class Leetcode13 {
	public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        
        int sum = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            int num = map.get(s.charAt(i));
            sum += num * 4 > sum ? num : -num;
        }
        return sum;
    }
}
