package collections_questions;

public class q12 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int temp=arr[arr.length-1];
		for(int i=0; i<arr.length-1; i++) {
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
