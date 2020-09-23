package leetcode;

public class Leetcode387 {
	public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++){
            if(isUnique(s, s.charAt(i)))
               return i;
        }
        return -1;
    }
    public boolean isUnique(String s, char c){
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c)
                count++;
            if(count > 2)
            return false;
        }
        
        return true;
    }
}
