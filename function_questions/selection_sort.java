package function_questions;

public class selection_sort {

	public static void main(String[] args) {
		int [] arr= {38,52,9,18,6,62,13};
		selection_sort(arr);
		System.out.println("After Sorting the Array");
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}	
	}

	private static void selection_sort(int[] arr) {
		int min,temp=0;
		for(int i=0; i<arr.length; i++) {
			min=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
				 temp=arr[i];
				 arr[i]=arr[min];
				 arr[min]=temp;
			}
		}
	}

}
