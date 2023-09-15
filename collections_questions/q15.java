package collections_questions;

public class q15 {

	public static void main(String[] args) {
		int arr[]={2,4,3,4,5,6,7};
		int key=4;
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		System.out.println("Frequency of " +key +" is : "+count);

	}

}
