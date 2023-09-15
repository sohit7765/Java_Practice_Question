package function_questions;

public class q30 {

	public static void main(String[] args) {
		int[]  arr= {10, 20, 10, 30, 10, 30, 30};

		oddoccuring(arr);
	}
	static void oddoccuring(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int c=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) 
					c++;
			}
			if(c%2 !=0) {
				System.out.print(arr[i]+",");
			}
		}
	}

}
