package function_questions;

public class q33 {

	public static void main(String[] args) {
		int[] arr= {1,3,4,5,3,4,6,2,7,1};
		firstduplicates(arr);

	}

	private static void firstduplicates(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("First duplicates element is = " + arr[i]);
					return;
				}
			}
		}
	}

}
