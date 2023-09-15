package Array_questions;

public class q1 {

	public static void main(String[] args) {
		int arr[]= {3,5,2,11,32,54,65};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(arr[1]);
		/*System.out.println("Second largest elements presents in the Array.....");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[1]);
		}*/

	}

}
