package function_questions;

public class q14 {

	public static void main(String[] args) {
		int [] arr= {2,4,3,11,32,65,78,41};
		Even_oddCount(arr);
	}
	static void Even_oddCount(int[] arr) {
		int Even_count=0;
		int odd_count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
			 Even_count++;
		 }
			else {
				odd_count++;
			} 
		}
		System.out.println("Even_Count = "+Even_count+" "+"Odd_count = "+odd_count);
		
	}

}
