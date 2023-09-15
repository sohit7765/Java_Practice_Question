package function_questions;

public class q8 {
	public static void main(String[] args) {
		int [] arr= {32,12,54,67,87,98,34};
		sort_Array(arr);

	}
	 static void sort_Array(int[] arr) {
		 int temp=0;
		 for(int i=0; i<arr.length; i++) {
			 for(int j=i+1; j<arr.length; j++) {
				 if(arr[i]>arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
		 }
	}
}