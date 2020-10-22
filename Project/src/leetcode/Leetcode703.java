package leetcode;

import java.util.PriorityQueue;

public class Leetcode703 {
	PriorityQueue<Integer> pq;
    private int k;
    
    public Leetcode703(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            if(pq.size() == k){
                if(pq.peek() < nums[i]){
                    pq.poll();
                    pq.add(nums[i]);
                }
            } else
                add(nums[i]);
        }
    }
    
    public int add(int val) {
        if(pq.size() == k){
            if(pq.peek() < val){
                pq.poll();
                pq.add(val);
            }
        } else{
            pq.add(val);
        }
            
        return pq.peek();
    }
}
