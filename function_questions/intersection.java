package function_questions;
import java.util.*;
public class intersection {

	public static void main(String[] args) {
		int[] arr= {5,6,8,9,3,11,23,5,23,11,65};
		duplicates(arr);
		//System.out.println("Duplicates Elements present in the Array Are....");
		//printArray(arr);
	}

	static void duplicates(int[] arr) {
		System.out.println("Duplicates elements present in the Array Are..");
		 for(int i=0; i<arr.length-1; i++) {
			 for(int j=i+1; j<arr.length; j++) {
				 if(arr[i]==arr[j]) {
					 System.out.println(arr[i]);
				 }
			 }
		 }
	}
}
