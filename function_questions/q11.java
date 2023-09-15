package function_questions;

import java.util.Arrays;

public class q11 {

	public static void main(String[] args){
		int [][] arr= {{14,7,3},{2,54,67},{4,76,89}};
		int target=67;
		int[] ans=LinearSearch(arr,target);
		System.out.println("The maximum Elements present in Array is "+ maximum(arr));
		System.out.println(Arrays.toString(ans));
	}
	static int maximum(int[][] arr) {
		 int max=arr[0][0];
		 for(int i=0; i<3; i++) {
			 for(int j=0; j<3; j++) {
				 if(arr[i][j]>max) {
					 max=arr[i][j];
				 }
			 }
		 }
		 return max;
		
	}
	static int [] LinearSearch(int[][] arr, int target) {
		 for(int i=0; i<3; i++) {
			 for(int j=0; j<3; j++) {
				 if(arr[i][j]==target) {
					 return new int[] {i,j};
				 }
			 }
		 }
		 return new int[] {-1,-1};
	 }

}
