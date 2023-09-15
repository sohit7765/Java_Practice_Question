package function_questions;
import java.util.*;
public class distinctElements {

	public static void main(String[] args) {
		int [] arr= {5,10,15,5,4,5};
		distint(arr);
	}
	static void distint(int[] arr) {
		Set<Integer> s1=new HashSet<>();
		for(int n1:arr) {
			s1.add(n1);
		}
		System.out.println("Distinct Elements Are.....");
		for(int n2:s1) {
			System.out.println(n2);
		}
	}

}
