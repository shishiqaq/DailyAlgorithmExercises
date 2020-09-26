package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
	public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int result = 0, i = 0, j = 0;
        while(i < s.length() && j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                result = Math.max(result, j - i);
            } else{
                set.remove(s.charAt(i++));
            }
        }
        return result;
    }
}
