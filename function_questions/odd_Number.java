package function_questions;
import java.util.*;
public class odd_Number {

	public static void main(String[] args) {
		int[] arr= {32,54,67,89,33,45,69,95};
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				a1.add(arr[i]);
			}
			else {
				a2.add(arr[i]);		
		}
	}
		System.out.println("Even Number");
		for(int no: a1) {
			System.out.print(no+"\n");
		}
		System.out.println("Odd Number");
		for(int no2: a2) {
			System.out.print(no2+"\n");
		}
}
}
