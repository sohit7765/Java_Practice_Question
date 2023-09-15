package function_questions;

public class q18 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		insert(arr);
		System.out.println("After Inserting the Elements");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void insert(int[] arr) {
		int pos=3;
		int element=100;
		for(int i=arr.length-1; i>=pos; i--) {
			arr[i]=arr[i-1];
		}
		arr[pos-1]=element;	
	}

}
