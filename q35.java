package function_questions;

public class q35 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		int temp=arr[n-1];
		for(int i=1; i<n; i++) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

}
