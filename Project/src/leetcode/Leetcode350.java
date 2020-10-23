package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode350 {
	
	public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++)
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i])){
                if(map.get(nums2[i]) > 0){
                    l.add(nums2[i]);
                    map.put(nums2[i], map.get(nums2[i]) - 1);
                }
            }
        }
        int intersection[] = new int[l.size()];
        int i = 0;
        for(int n : l)
            intersection[i++] = n;
        return intersection;
    }
}
