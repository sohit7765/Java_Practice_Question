package function_questions;

public class q17 {

	public static void main(String[] args) {
		int[] arr= {7, 5, 9, 3, 0, 8, 6};
		int sum=12;
		triplet(arr,sum);
	}
	 static void triplet(int[] arr,int sum) {
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for(int k=j+1; j<arr.length; j++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
					}
				}
			}
		}
			}
}
