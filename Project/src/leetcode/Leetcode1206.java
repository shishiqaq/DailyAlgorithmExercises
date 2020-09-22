package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1206 {
	Map<Integer, Integer> map;
    public Leetcode1206() {
        map = new HashMap<>();
    }
    
    public boolean search(int target) {
        return map.containsKey(target);
    }
    
    public void add(int num) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    
    public boolean erase(int num) {
        if(map.containsKey(num)){
            if(map.get(num) == 1){
                map.remove(num);
                return true;
            } else if(map.get(num) > 1){
                map.replace(num, map.get(num) - 1);
                return true;
            }
        }
        return false;
    }
}
