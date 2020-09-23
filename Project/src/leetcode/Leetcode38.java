package leetcode;

public class Leetcode38 {
	public String countAndSay(int n) {
        if(n == 1)
            return "1";
        StringBuilder result = new StringBuilder();
        String str = countAndSay(n-1);
        int count = 1;
        for(int i = 0;i < str.length() - 1; i++, count++){
            if(str.charAt(i) != str.charAt(i + 1)){
                result.append(count).append(str.charAt(i));
                count = 0;
            }
        }
        int length = str.length() - 1;
        return result.append(count).append(str.charAt(length)).toString();
    }
}
