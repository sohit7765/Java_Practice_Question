package tech_point_Array_questions;

public class q9 {

	public static void main(String[] args) {
		int arr[]= {1,24,54,11,21,43,65,16};
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
			System.out.println("The first largest element is "+max);
			System.out.println("The first smallest element is "+min);

	}

}
