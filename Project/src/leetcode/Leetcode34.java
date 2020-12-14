package leetcode;

public class Leetcode34 {
	public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int l = 0, r = nums.length-1, start = 0, end = 0;
        boolean found = false;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                result[0] = mid;
                found = true;
                start = mid;
                end = mid;
                break;
            }
            if(nums[mid] < target)
                l = mid+1;
            else
                r = mid-1;
        }
        if(found) {
            while(start > 0 && nums[start-1] == target)
                start--;
            while(end < nums.length-1 && nums[end+1] == target)
                end++;
            result[0] = start;
            result[1] = end;
        }
        
        return result;
    }
}
