package function_questions;

public class q13 {

	public static void main(String[] args) {
		int [] arr= {23,4,11,42,56,78,89,566,111};
		display(arr);
	}

	 static void display(int[] arr) {
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
		 System.out.println("The Number of even count = "+Even_count+ "\n" +"The Number of odd_count = "+odd_count);
	 }
}
