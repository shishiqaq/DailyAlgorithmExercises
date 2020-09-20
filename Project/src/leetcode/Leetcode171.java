package leetcode;

public class Leetcode171 {
	public int titleToNumber(String s) {
        int n = s.length(), num = 0;

        for(int i = 0; i < n; i++){
            num = 26 * num + s.charAt(i) - 'A' + 1;
        }
        return num;
    }
}
