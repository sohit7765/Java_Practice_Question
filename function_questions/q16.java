package function_questions;

public class q16 {

	public static void main(String[] args) {
		int[] arr= {100,180,260,310,40,535,695};
		int MAX=maximum(arr);
		int Min=minimum(arr);
		System.out.println("MAximum profit When we buy and sell a product ");
		int MAxProfit=MAX-Min;
		System.out.println(MAxProfit);

	}

	private static int minimum(int[] arr) {
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

	static int maximum(int[] arr){
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
