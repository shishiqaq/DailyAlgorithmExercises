package leetcode;

import java.util.Arrays;

public class Leetcode88 {
	//O(nlogn)
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        
        for(int i = m; i < m + n; i++){
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    }
	
	public void merge2(int[] nums1, int m, int[] nums2, int n) {
		int i = m + n - 1, j = m - 1, k = n - 1;
        
        while(i >= 0 && j >= 0 && k >= 0){
            if( nums1[j] < nums2[k])
                nums1[i--] = nums2[k--];
            else
                nums1[i--] = nums1[j--];
        }
        while(k >= 0)
            nums1[i--] = nums2[k--];
	}
}
