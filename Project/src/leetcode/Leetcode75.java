package leetcode;

public class Leetcode75 {
	public void sortColors(int[] nums) {
        int one = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                swap(nums, i, one);
                one++;
            }
        }
        for(int i = one; i < nums.length; i++){
            if(nums[i] == 1){
                swap(nums, i, one);
                one++;
            }
        }
    }
    
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
