package function_questions;
public class q15 {

	public static void main(String[] args) {
		int [] arr= {32,54,67,544,23,45,77,11,46};
		KLargest(arr);

	}
	static void KLargest(int[] arr) {
		int k=1;
		int max=arr[0];
		for(int i=0; i<arr.length;) {
			if(arr[i]>max) {
				max=arr[i];
			}
			i=k-1;
			System.out.println("The K largest Element is = "+arr[i]);
			break;
		}
		
	}

}
