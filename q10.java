package collections_questions;
import java.util.*;
public class q10 {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(2);
		l1.add(5);
		l1.add(7);
		l1.add(11);
		l1.add(16);
		l1.add(19);
		l1.add(24);
		Collections.shuffle(l1);
		for(int l2:l1) {
			System.out.println(l2);
		}
	}

}
