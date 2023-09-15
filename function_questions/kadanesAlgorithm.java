package function_questions;

public class kadanesAlgorithm {

	public static void main(String[] args) {
		int[] arr= {-5,4,6,-3,4,-1};
		int ans=MaxSumSubArray(arr);
		System.out.println(ans);
	}
	private static int MaxSumSubArray(int[] arr) {
		int currentSum=0;
		int maxSum=0;
		for(int i=0; i<arr.length; i++) {
			currentSum=currentSum+arr[i];
			if(currentSum>maxSum) {
				maxSum=currentSum;
			}
			if(currentSum<0) {
				currentSum=0;
			}
		}
		return maxSum;
	}

}
