package algorithm;

public class Sort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,2,5,6,22,8,3,0};
//		bubbleSort(array);
//		insertion(array);
//		selection(array);
		mergeSort(array);
		for(int a : array)
			System.out.print(a + ",");
	}
	
	//O(n^2)
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	//O(n^2)
	public static void insertion(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			int value = arr[i], index = i;
			while(index > 0 && value < arr[index-1]) {
				arr[index] = arr[index-1];
				index--;
			}
			arr[index] = value;
		}
	}
	
	//O(n^2)
	public static void selection(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	//O(nlogn)
	public static void merge(int[] left, int[] right, int[] arr) {
		int i = 0, j = 0, k = 0;
		int nl = left.length, nr = right.length;
		
		while(i < nl && j < nr) {
			if(left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < nl) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < nr) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	public static void mergeSort(int[] arr) {
		if(arr.length < 2)
			return;
		int mid = arr.length/2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		//0~mid-1
		for(int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		//mid-arr.length-1
		for(int i = 0; i < right.length; i++) {
			right[i] = arr[mid + i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);
	}
}
