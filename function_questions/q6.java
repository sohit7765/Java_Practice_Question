package function_questions;

import java.util.Arrays;

public class q6 {

	public static void main(String[] args) {
		int [] arr= {2,45,76,34,87,11};
		Swap(arr,1,4);
		System.out.println(Arrays.toString(arr));
	}
	static void Swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
