package function_questions;

public class q5 {

	public static void main(String[] args) {
		int [] arr= {32,54,67,12,43,89,36};
		int n=arr.length;
		System.out.println("The first Largest elements is "+maximum(arr,n));
	}
	static int maximum(int[] arr,int n) {
		int max=arr[0];
		for(int i=0; i<n; i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
		}
		return max;
	}

}
