package leetcode;

public class Leetcode344 {
	//time O(n) space O(n)
	public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }
    public void reverse(char[] s, int left, int right){
        if(left >= right)
            return;
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reverse(s, ++left, --right);
    }
    //time O(n) space O(1)
    public void reverseString2(char[] s) {
        int left = 0, right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
