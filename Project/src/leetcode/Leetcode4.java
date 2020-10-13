package leetcode;

public class Leetcode4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        // if(m > n)
        //     return findMedianSortedArrays(nums2, nums1);
        if (m > n) { // to ensure m<=n
            int[] temp = nums1; nums1 = nums2; nums2 = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, half = (m + n + 1) / 2;
        while(iMin <= iMax){
            int i = (iMin + iMax)/2;
            int j = half - i;
            if(i > iMin && nums1[i-1] > nums2[j])
                iMax = i - 1;
            else if(i < iMax && nums2[j - 1] > nums1[i])
                iMin = i + 1;
            else{
                int leftMax, rightMin;
                if(i == 0)
                    leftMax = nums2[j-1];
                else if(j == 0)
                    leftMax = nums1[i-1];
                else
                    leftMax = Math.max(nums1[i-1], nums2[j-1]);
                
                if((m + n) % 2 == 1)
                    return leftMax;
                
                if(i == m)
                    rightMin = nums2[j];
                else if(j == n)
                    rightMin = nums1[i];
                else
                    rightMin = Math.min(nums1[i], nums2[j]);
                
                return (leftMax + rightMin) / 2.0;
            }
        }
        return 0.0;
    }
}
