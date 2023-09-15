package function_questions;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr= {3,1,5,4,2};
		bubbleSort(arr);
	    System.out.println("After sorting the Array");
		printArray(arr);
	}
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	 static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.print(arr[i]+",");
		}
		
	}

}
