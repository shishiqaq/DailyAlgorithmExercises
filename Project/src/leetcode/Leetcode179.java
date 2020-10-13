package leetcode;

import java.util.Arrays;

public class Leetcode179 {
	
	public String largestNumber(int[] nums) {
        String[] asString = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            asString[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(asString, (a, b) -> {
            String o1 = a + b;
            String o2 = b + a;
            return o2.compareTo(o1);
        });
        
        if(asString[0].equals("0"))
            return "0";
        
//         StringBuilder result = new StringBuilder();
//         for(String num : asString){
//             result.append(num);
//         }
        
//         return result.toString();
        String result = new String();
        for(String num : asString){
            result += num;
        }
        
        return result;
        
    }
}
