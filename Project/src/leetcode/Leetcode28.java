package leetcode;

public class Leetcode28 {
	public int strStr(String haystack, String needle) {
        int h = haystack.length(), n = needle.length();
        if(h < n)
            return -1;
        if(n == 0)
            return 0;

        char[] hays = haystack.toCharArray();
        char[] need = needle.toCharArray();
        for(int i = 0; i <= h - n; i++){
            if(hays[i] == need[0]){
                if(check(hays, need, i))
                    return i;
            }
        }
        return -1;
    }
    public boolean check(char[] h, char[] n, int index){
        for(int i = 0; i < n.length; i++){
            if(h[i + index] != n[i])
                return false;
        }
        return true;
    }
}
