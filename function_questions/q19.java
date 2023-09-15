package function_questions;
import java.util.*;
public class q19 {

	public static void main(String[] args) {
		int[] arr= {1,2,2,3,3,4,5,5,6,7};
		System.out.println("After removing duplicates Elements");
		removeduplicatesElements(arr);
		System.out.println("\nDuplicates elements Are");
		duplicateElements(arr);

	}

	private static void duplicateElements(int[] arr) {
		Set<Integer> s1=new HashSet<>();
		for(int n1: arr) {
			boolean ans=s1.add(n1);
			if(ans==false) {
				System.out.print(n1+",");
			}
		}
	}

	private static void removeduplicatesElements(int[] arr) {
		Set<Integer> s1=new HashSet<>();
		for(int n1: arr) {
			s1.add(n1);
		}
		for(int n2: s1) {
			System.out.print(n2+",");
		}
	}

}
