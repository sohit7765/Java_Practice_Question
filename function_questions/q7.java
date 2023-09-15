package function_questions;

public class q7 {

	public static void main(String[] args) {
		int []arr= {32,54,23,12,56,34,65};
		int item=23;
		int res=LinearSearch(arr,item);
		if(res==-1) {
			System.out.println("Item is not present");
		}
		else {
			System.out.println("Item is present at "+res+" index position");
		}
	}
	static int LinearSearch(int[] arr, int item) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;	
	}

}
