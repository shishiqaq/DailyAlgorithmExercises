package leetcode;

import java.util.Arrays;

public class Leetcode155 {
	int size = 10;
    int top = 0;   
    int[] arr = new int[size];
    
    public Leetcode155() {
        
    }
    
    public void push(int x) {
        if(top < size - 1)
            arr[top++] = x;
        else{
            size *= 2;
            arr = Arrays.copyOf(arr, size);
            arr[top++] = x;
        }
    }
    
    public void pop() {
        if(top > 0)
            top--;
    }
    
    public int top() {
        if(top > 0)
            return arr[top-1];
        else
            return -1;
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < top; i++)
            if(arr[i] < min)
                min = arr[i];
        return min;
    }
}
