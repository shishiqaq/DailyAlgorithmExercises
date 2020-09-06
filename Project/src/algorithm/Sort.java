package algorithm;

public class Sort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,2,5,6,22,8,3,0};
//		bubbleSort(array);
		insertion(array);
//		selection(array);
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
}
