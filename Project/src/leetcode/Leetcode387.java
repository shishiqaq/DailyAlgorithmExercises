package leetcode;

public class Leetcode387 {
	//O(n^2)
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
    //O(n)
    public int firstUniqChar2(String s) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i)-97;
            count[index]++;
        }
            
        for(int i = 0; i < s.length(); i++){
            if(count[s.charAt(i)-97] == 1)
                return i;
        }
        return -1;
    }
}
