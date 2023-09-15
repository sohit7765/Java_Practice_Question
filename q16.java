package collections_questions;
import java.util.*;
public class q16 {

	public static void main(String[] args) {
		Integer [] arr= {1,2,1,2,4,5,6,5,7};
		Set<Integer> al=new HashSet<>(Arrays.asList(arr));
		for(int s1:al) {
			al.add(s1);
		}
		System.out.println(al);

	}

}
