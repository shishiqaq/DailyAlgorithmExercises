package leetcode;

import java.util.Arrays;

public class Leetcode5 {
	public String longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return "";
        
        char[] s2 = addBoundary(s.toCharArray());
        int[] p = new int[s2.length];
        int c = 0, r = 0;
        
        for(int i = 0; i < s2.length; i++){
            int mirror = c - (i - c);
            if(i < r)
                p[i] = Math.min(r-i, p[mirror]);
            else
                p[i] = 0;
                
            while((i + p[i] + 1) < s2.length && (i - p[i] - 1) >=0 && s2[i + p[i] + 1] == s2[i - p[i] - 1])
                p[i]++;
            
            if(i + p[i] > r){
                c = i;
                r = i + p[i];
            }
        }
        
        int len = 0, index = 0;
        for(int i = 1; i < s2.length - 1; i++){
            if(p[i] > len){
                len = p[i];
                index = i;
            }
        }
        
        char[] result = Arrays.copyOfRange(s2, index-len, index+len+1);
        return String.valueOf(removeBoundary(result));
    }
    
    public char[] addBoundary(char[] cs){
        if(cs == null || cs.length == 0)
            return "||".toCharArray();
        
        char[] s = new char[cs.length * 2 + 1];
        
        for(int i = 0; i < s.length - 1; i += 2){
            s[i] = '|';
            s[i+1] = cs[i/2];
        }
        s[s.length - 1] = '|';
        
        return s;
    }
    
    public char[] removeBoundary(char[] cs){
        if(cs == null || cs.length < 3)
            return "".toCharArray();
        
        char[] s = new char[(cs.length-1)/2];
        
        for(int i = 0; i < s.length; i++)
            s[i] = cs[2 * i + 1];
        return s;
    }
}
