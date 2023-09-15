package collections_questions;
import java.util.*;
public class q9 {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(2);
		l1.add(5);
		l1.add(7);
		LinkedList<Integer> l2=new LinkedList<>();
		l2.add(3);
		l2.add(11);
		LinkedList<Integer> l3=new LinkedList<>();
		l3.addAll(l1);
		l3.addAll(l2);
		Collections.sort(l3);
		Collections.reverse(l3);
		for(Integer n:l3) {
			System.out.println(n);
		}
	}

}
