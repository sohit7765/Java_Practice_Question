package function_questions;

public class Reverse_Array {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,8,7,6,5,9};
		ReverseArray(arr,4,7);
		System.out.println("After reversing the Array");
		printArray(arr);
	}

	 static void printArray(int[] arr) {
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }
	}

	private static void ReverseArray(int[] arr, int start, int end) {
		while(start<end) {
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
		
	}
	
	}
