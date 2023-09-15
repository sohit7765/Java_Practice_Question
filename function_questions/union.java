package function_questions;
import java.util.*;
public class union {

	public static void main(String[] args) {
		int[] arr1= {5,6,8,9,3};
		int [] arr2= {2,5,6,7,11,9};
		union(arr1,arr2);
	}

	private static void union(int[] arr1, int[] arr2) {
		Set<Integer> s1=new HashSet<>();
		for(int n1:arr1) {
			s1.add(n1);
		}
		for(int n2:arr2) {
			s1.add(n2);
		}
		for(int elements :s1) {
			System.out.println(elements);
		}
	}
}
