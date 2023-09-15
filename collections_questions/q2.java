package collections_questions;
import java.util.ArrayList;
import java.util.Collections;
public class q2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(72);
		al.add(42);
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);

	}

}
