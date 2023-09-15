package function_questions;

public class q31 {

	public static void main(String[] args) {
			int[] arr= {4,3,4,4,4,5,5};
			int ans=oddoccuring(arr);
			System.out.println(ans);
		}

	private static int oddoccuring(int[] arr) {
		int res=arr[0];
		for(int i=1; i<arr.length; i++) {
			res=res^arr[i];
		}
		return res;
		
	}
}


